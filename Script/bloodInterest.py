import csv

# Define the range for userId
start_id = 100
end_id = 1000

# Create a list of dictionaries where each dictionary represents a row in the CSV
data = [{'userId': i} for i in range(start_id, end_id + 1)]

# Specify the name of the CSV file
csv_file = 'user_data.csv'

# Define the field names for the CSV
fieldnames = ['userId']

# Write the data to the CSV file
with open(csv_file, mode='w', newline='') as file:
    writer = csv.DictWriter(file, fieldnames=fieldnames)

    # Write header
    writer.writeheader()

    # Write rows
    writer.writerows(data)

print(f"CSV file '{csv_file}' has been generated.")
