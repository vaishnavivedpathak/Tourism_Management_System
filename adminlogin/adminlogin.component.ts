import { Component } from '@angular/core';
import { AdminLogin } from '../models/admin-login';
import { AdminLoginService } from '../services/admin-login.service';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-adminlogin',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './adminlogin.component.html',
  styleUrl: './adminlogin.component.css'
})
export class AdminloginComponent {
ad:AdminLogin= new AdminLogin();
constructor(private adserve:AdminLoginService, private router:Router)
{

}
submitdata()
{
  this.adserve.login(this.ad).subscribe((data:AdminLogin)=>{
    if(data!=null)
      {
        localStorage.setItem('aemailid',data.emailid)
        alert("login successfull")
        this.router.navigate(['/'])
      }
      else
      alert("Invalid email address and password")
  })
}
}
