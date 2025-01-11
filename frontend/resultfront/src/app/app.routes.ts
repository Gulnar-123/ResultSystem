import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { NoticesComponent } from './notices/notices.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { ResultComponent } from './result/result.component';
import { AddmarksComponent } from './addmarks/addmarks.component';
import { AddnoticesComponent } from './addnotices/addnotices.component';
import { ViewresultComponent } from './viewresult/viewresult.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'notices',component:NoticesComponent},
    {path:'register',component:RegisterComponent},
    {path:'login',component:LoginComponent},
    {path:'profile',component:ProfileComponent},
    {path:'result',component:ResultComponent},
    {path:'addmarks',component:AddmarksComponent},
    {path:'addnotices',component:AddnoticesComponent},
    {path:'viewresult',component:ViewresultComponent}

];
