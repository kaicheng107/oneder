import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { AlertController } from 'ionic-angular';
import { ProfilePage } from '../profile/profile';
/**
 * Generated class for the MatchesPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@Component({
  selector: 'page-matches',
  templateUrl: 'matches.html',
})
export class MatchesPage {
  Profile = ProfilePage;

  constructor(public navCtrl: NavController, public navParams: NavParams,
  public alertCtrl: AlertController) {
  }


  ionViewDidLoad() {
    console.log('ionViewDidLoad MatchesPage');
  }

  doAlert() {
    let alert = this.alertCtrl.create({
      title: 'Confirmed Booking!',
      message: 'Your badminton match has been scheduled!',
      buttons: ['Ok']
    });
    alert.present()
  }

}
