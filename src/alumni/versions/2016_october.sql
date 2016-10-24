/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Oct 24, 2016
 */

drop table if exists alumni_users;
create table alumni_users(
id int
,first_name varchar(255)
,approved int
,role_id int
,email varchar(255)
,suffix_name varchar(255)
,middle_name varchar(255)
,activated int
,last_name varchar(255)
,role varchar(255)
,active int
);