import { Component, OnInit } from '@angular/core';
import { Application } from '../model/application';
import { ApplicationService } from '../service/application.service';

@Component({
  selector: 'app-application-list',
  templateUrl: './application-list.component.html',
  styleUrls: ['./application-list.component.css']
})
export class ApplicationListComponent implements OnInit {

  applications: Application[];

  constructor(private applicationService: ApplicationService) {

  }

  ngOnInit() {
    this.applicationService.findAll().subscribe(data => {
      this.applications = data;
    });
  }
}