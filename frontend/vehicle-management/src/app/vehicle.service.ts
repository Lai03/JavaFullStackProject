import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Vehicle } from './vehicle';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {
  private baseUrl = 'http://localhost:8080/vehicles';

  constructor(private http: HttpClient) { }

  getVehicles(): Observable<Vehicle[]> {
    return this.http.get<Vehicle[]>(`${this.baseUrl}`);
  }

  getVehicle(id: string): Observable<Vehicle> {
    return this.http.get<Vehicle>(`${this.baseUrl}/${id}`);
  }

  createVehicle(vehicle: Vehicle): Observable<Vehicle> {
    return this.http.post<Vehicle>(`${this.baseUrl}`, vehicle);
  }

  updateVehicle(id: string, vehicle: Vehicle): Observable<Vehicle> {
    return this.http.put<Vehicle>(`${this.baseUrl}/${id}`, vehicle);
  }

  deleteVehicle(id: string): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }
}
