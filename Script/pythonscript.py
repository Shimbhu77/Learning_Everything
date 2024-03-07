import csv

def create_csv_file(file_name="requests_data.csv"):
    # Specify headers
    headers = ["requestOwnerId", "requestOwnerType", "requestType", "status"]

    # Create and open the CSV file in write mode
    with open(file_name, 'w', newline='') as csvfile:
        # Create a CSV writer object
        csv_writer = csv.writer(csvfile)

        # Write headers to the CSV file
        csv_writer.writerow(headers)

        # Generate and write data to the CSV file
        for request_owner_id in range(100, 2501):
            data = {
                "requestOwnerId": request_owner_id,
                "requestOwnerType": "USER",
                "requestType": "APPROVAL",
                "status": "APPROVED"
            }
            row_data = [data[header] for header in headers]
            csv_writer.writerow(row_data)

if __name__ == "__main__":
    create_csv_file()
    print("CSV file created successfully.")
