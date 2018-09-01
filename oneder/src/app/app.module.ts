import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import {Geolocation} from '@ionic-native/geolocation';
import {HttpClientModule} from '@angular/common/http';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { ProfilePage } from '../pages/profile/profile';
import { MatchesPage } from '../pages/matches/matches';
import { PlayersPage } from '../pages/players/players';
import { CMatchPage } from '../pages/c-match/c-match';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { OneMapProvider } from '../providers/one-map/one-map';
import { PlayerServiceProvider } from '../providers/player-service/player-service';


@NgModule({
  declarations: [
    MyApp,
    HomePage,
    ProfilePage,
    MatchesPage,
    PlayersPage,
    CMatchPage,
    
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
    HttpClientModule,
    
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    ProfilePage,
    MatchesPage,
    PlayersPage,
    CMatchPage,

  ],

  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    Geolocation,
    OneMapProvider,
    PlayerServiceProvider
  ]
})
export class AppModule {}
