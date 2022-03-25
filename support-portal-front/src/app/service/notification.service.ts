import { Injectable } from '@angular/core';
import { NotifierService } from 'angular-notifier';
import { NotificationType } from '../enum/notificationType.enum';

@Injectable({
  providedIn: 'root'
})
export class NotificationService {

  constructor(private notifier: NotifierService) { }

  notify(type: NotificationType, message: string) {
    this.notifier.notify(type, message);
  }

}
