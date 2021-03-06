import { Component, OnInit } from '@angular/core';
import { Users } from '../shared/classes/users';
import { Router, ActivatedRoute } from "@angular/router";
import { ProfileService } from 'src/app/shared/services/createprofile.service';
import { Currentuser } from '../shared/classes/currentuser';
import { UsersService } from '../shared/services/users.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  users: Users;
  constructor(private router: Router,
    private route: ActivatedRoute,
    private profile: ProfileService,
    private us : UsersService
    ) { }

  ngOnInit(): void {
    
    
    this.users = this.us.getUser(); //NEED ANYWHERE THE LOGGED-IN USER IS REFERRED TO...EVERYWHERE!!!
    
  }

  // if(this.users.gender == 'Male') {
  //   this.users.gender == 1
  // } else if (this.users.gender == "Female") {
  //   this.users.gender == 2
  // } else {
  //   this.users.gender == 3
  // }

  updateProfile() {
    this.profile.updateProfile(this.users).subscribe(
      users => {
        this.users = users;
        this.router.navigate(["questions"])
      }
    );
    // this.profile.updateProfile(this.users).subscribe((data)=>{
  //     this.router.navigate(["questions"])
  //   // });
   }
}

