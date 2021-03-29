export interface Client {
  serial?: number;
  identificationNumber?: number;
  names?: string;
  lastName?: string;
  direction?: string;
  email?: string;
  telephone?: string;
  telephoneAditional?: string;
  phone?: string;
  position: number;
  descriptionPosition?: string;
  city: number;
  descriptionCity?: string;
  birthDay?: string;
  gender?: string;
  community: number;
  descripcionCommunity?: string;
  companyName?: string;
  divition: number;
  descriptionDivition?: string;
  country: number;
  descripcionCountry?: string;
  hobbies?: string;
  retirementDate?: string;
  registerDate?: string;
}