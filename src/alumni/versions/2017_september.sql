/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Sep 21, 2017
 */

alter table alumni_users add civil_status varchar(255) default '';
alter table alumni_users add gender varchar(255) default '';
alter table alumni_users add date_of_birth date;
alter table alumni_users add blood_type varchar(255) default '';
alter table alumni_users add home_address varchar(255) default '';
alter table alumni_users add level varchar(255) default '';
alter table alumni_users add year varchar(255) default '';
alter table alumni_users add course varchar(255) default '';
alter table alumni_users add major varchar(255) default '';
alter table alumni_users add image varchar(255) default '';

