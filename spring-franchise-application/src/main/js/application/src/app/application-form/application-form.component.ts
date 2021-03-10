import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ApplicationService } from '../service/application-service.service';
import { Application } from '../model/application';

@Component({
  selector: 'app-application-form',
  templateUrl: './application-form.component.html',
  styleUrls: ['./application-form.component.css']
})
export class ApplicationFormComponent {

  application: Application;

  constructor(private route: ActivatedRoute, private router: Router, private applicationService: ApplicationService) {
    this.application = new Application();
  }

  onSubmit() {
    this.applicationService.save(this.application).subscribe(result => this.gotoApplicationList());
  }

  gotoApplicationList() {
    this.router.navigate(['/applications']);
  }
}