import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import {Geolocation} from '@ionic-native/geolocation';
import { OneMapProvider } from '../../providers/one-map/one-map';
import {} from '';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})

export class HomePage {
  lat: any;
  lng: any;
  api: string;
  constructor(public navCtrl: NavController, public geolocation: Geolocation, private oneMap: OneMapProvider) {
    this.api = this.oneMap.getApi();
  }

  ionViewDidLoad(){
    this.geolocation.getCurrentPosition().then(resp => {
      this.lat= resp.coords.latitude;
      this.lng = resp.coords.longitude;
      this.api = this.api+"/privateapi/commonsvc/revgeocode/?location="+this.lat+","+this.lng+"&token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjE5NjcsInVzZXJfaWQiOjE5NjcsImVtYWlsIjoia2FpY2hlbmcxMDdAZ21haWwuY29tIiwiZm9yZXZlciI6ZmFsc2UsImlzcyI6Imh0dHA6XC9cL29tMi5kZmUub25lbWFwLnNnXC9hcGlcL3YyXC91c2VyXC9zZXNzaW9uIiwiaWF0IjoxNTM1Nzc0ODE0LCJleHAiOjE1MzYyMDY4MTQsIm5iZiI6MTUzNTc3NDgxNCwianRpIjoiMTYwNGZiYWFmNGU3MDA0Zjg1ZmRiN2NmYzkyOWE3ZjQifQ.u3I2F87wL6C7yY0dHNfpUP-hPNo-iOMwvEEoOmV8SE4"+"&buffer=10"+"&addressType=All"+"&otherFeatures=N";

      this.oneMap.updateApi(this.api);

      this.oneMap.getLocation()
        .subscribe(curloc =>console.log(curloc));

     }).catch(error => {
       console.log('Error getting location', error)
      });

     
  }

}
