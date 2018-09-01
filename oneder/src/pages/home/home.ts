import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import {Geolocation} from '@ionic-native/geolocation';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})

export class HomePage {
  lat: any;
  lng: any;
  constructor(public navCtrl: NavController, public geolocation: Geolocation) {
  }

  ionViewDidLoad(){
    this.geolocation.getCurrentPosition().then(resp => {
      this.lat= resp.coords.latitude;
      this.lng = resp.coords.longitude;
     }).catch(error => {
       console.log('Error getting location', error)
      });
  }

}
