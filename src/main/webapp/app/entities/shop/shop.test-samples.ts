import dayjs from 'dayjs/esm';

import { IShop, NewShop } from './shop.model';

export const sampleWithRequiredData: IShop = {
  id: 16300,
};

export const sampleWithPartialData: IShop = {
  id: 1273,
  productSize: 'over blinker phew',
  price: 16501.1,
  status: 'fitting pace',
  lastModified: dayjs('2023-10-17T20:43'),
  lastModifiedBy: 'urgently voluntarily',
  freeField1: 'motionless bombard shipping',
  freeField2: 'that or underneath',
  freeField5: 19278,
  freeField6: 15325,
  freeField7: dayjs('2023-10-17T23:43'),
  freeField9: true,
};

export const sampleWithFullData: IShop = {
  id: 14372,
  date: dayjs('2023-10-17T20:00'),
  name: 'realign sheepishly',
  description: 'lazily',
  product: 'beautifully political chaperon',
  productSize: 'wherever',
  price: 11080.97,
  emailId: 'absentmindedly',
  contactPerson: 'er',
  status: 'greenhouse',
  lastModified: dayjs('2023-10-18T14:57'),
  lastModifiedBy: 'finally off whenever',
  freeField1: 'reluctantly forum considering',
  freeField2: 'flame',
  freeField5: 13128,
  freeField6: 292,
  freeField7: dayjs('2023-10-18T03:14'),
  freeField8: dayjs('2023-10-18T01:50'),
  freeField9: false,
  freeField10: true,
};

export const sampleWithNewData: NewShop = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
