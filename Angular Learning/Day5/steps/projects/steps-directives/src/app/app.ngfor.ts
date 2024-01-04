import { CommonModule } from "@angular/common";
import { Component } from "@angular/core";

@Component({
      standalone:true,
      selector:'app-ngfor',
      template:`
        <div>
            <h1> Using *ngFor Directive</h1>
            <h1>Best Travel Places in India</h1>
            <ul *ngFor="let city of bestTravelPlacesInIndia; let idx=index">
                <li> {{idx+1}}. {{city}}</li>
            </ul>
        </div>
      `,
      imports:[CommonModule]

})

export class NgForChildComponent
{
    bestTravelPlacesInIndia: string[] = [
        'Jaipur, Rajasthan - Known as the Pink City for its stunning architecture.',
        'Varanasi, Uttar Pradesh - A spiritual and cultural hub on the banks of the Ganges.',
        'Goa - Famous for its beautiful beaches, vibrant nightlife, and Portuguese influence.',
        'Kerala - Explore the backwaters, hill stations, and beautiful beaches.',
        'Agra, Uttar Pradesh - Home to the iconic Taj Mahal.',
        'Rishikesh, Uttarakhand - A yoga and adventure sports destination on the banks of the Ganges.',
        'Hampi, Karnataka - A UNESCO World Heritage Site with ancient ruins.',
        'Ladakh, Jammu and Kashmir - Known for its breathtaking landscapes and monasteries.',
        'Mysuru, Karnataka - Rich in history and known for its grand Dasara celebrations.',
        'Andaman and Nicobar Islands - Beautiful islands with pristine beaches and coral reefs.',
        'Shimla, Himachal Pradesh - A popular hill station with colonial charm.',
        'Khajuraho, Madhya Pradesh - Famous for its ancient temples with intricate carvings.',
        'Udaipur, Rajasthan - A city of lakes and palaces.',
        'Darjeeling, West Bengal - Known for its tea gardens and stunning views of the Himalayas.',
        'Amritsar, Punjab - Home to the Golden Temple, a sacred Sikh shrine.',
      ];
}