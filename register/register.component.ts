import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { Register } from '../models/register';
import { RegisterServiceService } from '../services/register-service.service';
import { Router } from 'express';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent implements OnInit {
  reg:Register=new Register();
  ngOnInit(): void {
    
  }
   constructor(private regServ:RegisterServiceService ) 
   {

   } 
   submitdata()
   {
    this.regServ.newUser(this.reg).subscribe((data:Register)=>{
      if(data!=null)
        {
          alert('Registration Sucessfully')
        }
    })
   }
}
