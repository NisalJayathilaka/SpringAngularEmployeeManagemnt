import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private apiServeUrl = environment.apiBaseUrl;

  constructor(private http:HttpClient) { }

  public getEmployees(): Observable<Employee[]>{
    return this.http.get<Employee[]>(`${this.apiServeUrl}/api/v1/employee`);
  }

  public addEmployee(employee:Employee): Observable<Employee>{
    return this.http.post<Employee>(`${this.apiServeUrl}/api/v1/employee`,employee);
  }

  public updateEmployee(employee:Employee): Observable<Employee>{
    return this.http.put<Employee>(`${this.apiServeUrl}/api/v1/employee/update`,employee);
  }
  
  public deleteEmployee(employeeId:number): Observable<void>{
    return this.http.delete<void>(`${this.apiServeUrl}/api/v1/employee/${employeeId}`);
  }
  
}
