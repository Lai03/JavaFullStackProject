import { Component, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { importProvidersFrom } from '@angular/core';
import { provideHttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

interface Vehicle {
  id: number;
  year: number;
  model: string;
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, importProvidersFrom(provideHttpClient())], // Add HttpClientModule to imports
  template: `
    <h2>Vehicles</h2>
    <ul>
      <li *ngFor="let vehicle of vehicles()">
        {{ vehicle.year }} {{ vehicle.model }} (ID: {{ vehicle.id }})
      </li>
    </ul>
  `
})
export class AppComponent {
  private apiUrl = 'http://localhost:8080/api/vehicles';

  vehicles = signal<Vehicle[]>([]);

  constructor(private http: HttpClient) {
    this.fetchVehicles();
  }

  private fetchVehicles() {
    this.http.get<Vehicle[]>(this.apiUrl)
      .pipe(
        map(vehicles => vehicles.map(vehicle => ({ ...vehicle })))
      )
      .subscribe(vehicles => {
        this.vehicles.set(vehicles);
      });
  }
}