import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { Register } from '../models/register';
import { RegisterServiceService } from '../services/register-service.service';

import{Router} from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule , RouterLink,FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
reg:Register=new Register();
constructor(private regServ:RegisterServiceService,private router:Router)
{

}
submitdata()
{
  this.regServ.login(this.reg).subscribe((data:Register)=>
{
if(data!=null)
  {
    localStorage.setItem("emailid",data.emailid)
    alert('Login Successfully')
    this.router.navigate(['/'])
  }
})
}
}

