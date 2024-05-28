import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { CommonEngine } from '@angular/ssr';

@Component({
  selector: 'app-blog',
  standalone: true,
  imports: [ CommonModule,RouterLink],
  templateUrl: './blog.component.html',
  styleUrl: './blog.component.css'
})
export class BlogComponent {

}
