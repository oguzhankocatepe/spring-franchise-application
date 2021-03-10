import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Application } from '../model/application';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class ApplicationService {

  private applicationsUrl: string;

  constructor(private http: HttpClient) {
    this.applicationsUrl = 'http://localhost:8080/applications';
  }

  public findAll(): Observable<Application[]> {
    return this.http.get<Application[]>(this.applicationsUrl);
  }

  public save(application: Application) {
    return this.http.post<Application>(this.applicationsUrl, application);
  }
}