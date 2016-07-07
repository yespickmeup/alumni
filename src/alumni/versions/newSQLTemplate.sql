/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Jul 5, 2016
 */

drop schema if exists db_alumni;
create schema db_alumni;

use db_alumni;

drop table if exists family_relations;
create table family_relations(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,upload_status int
,relation varchar(255)
);

drop table if exists school_levels;
create table school_levels(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,upload_status int
,level varchar(255)
);

drop table if exists courses;
create table courses(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,upload_status int
,school_level_id varchar(255)
,course varchar(255)
);

drop table if exists course_majors;
create table course_majors(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,upload_status int
,school_level_id varchar(255)
,course_id varchar(255)
,major varchar(255)
);




drop table if exists alumnis;
create table alumnis(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,upload_status int
,alumni_no varchar(255)
,student_no varchar(255)
,fname varchar(255)
,mi varchar(255)
,lname varchar(255)
,sname varchar(255)
,gender int
,civil_status varchar(255)
,bday date
,landline_no varchar(255)
,email_address varchar(255)
,cellphone_no varchar(255)
,graduated_in varchar(255)
,graduated_on varchar(255)
,course varchar(255)
,major varchar(255)
,motto_in_life text
,password varchar(255)
,father_name varchar(255)
,father_is_alumni int
,father_occupation varchar(255)
,father_office_address varchar(255)
,mother_name varchar(255)
,mother_is_alumni varchar(255)
,mother_occupation varchar(255)
,mother_office_address varchar(255)
);

drop table if exists alumni_school_activities;
create table alumni_school_activities(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,upload_status int
,alumni_no varchar(255)
,student_no varchar(255)
,involvement varchar(255)
);

drop table if exists alumni_family_members;
create table alumni_family_members(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,upload_status int
,alumni_no varchar(255)
,student_no varchar(255)
,name varchar(255)
,relation varchar(255)
,name_before_married varchar(255)
,residence_address varchar(255)
,occupation varchar(255)
,office_address varchar(255)
);

alter table alumnis add level varchar(255) after graduated_on;


drop table if exists alumni_generated_cards;
create table alumni_generated_cards(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,upload_status int
,alumni_no varchar(255)
,student_no varchar(255)
);
