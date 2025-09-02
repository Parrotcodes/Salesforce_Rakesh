package Week3.Day4.Assignment;

class ISPmangaementSchemas {
//    SCHEMAS - ISP MANAGEMENT TABLES (Customer{main},address, plan -> subtables)

//    Customer Table
    /*
    Create table customer(
        customerid int PRIMARY key AUTO_INCREMENT,
        firstname varchar(50) not null,
        lastname varchar(50) not null,
        email varchar(100) unique not null,
        phone int unique not null
    );
     */

//    AddressTable - child of customer table
    /*
    Create table address (
        addressid int PRIMARY KEY AUTO_INCREMENT,
        customerid int unique,
        street varchar(50) not null,
        city varchar(50) not null,
        state varchar(50) not null,
        zipcode varchar(10) not null,
        FOREIGN KEY (customerid) references customer(customerid) on delete cascade
    );
     */

    //    PlanTable - child of customer table
    /*
    Create table Plan (
        planid int PRIMARY KEY AUTO_INCREMENT,
        customerid int,
        planname varchar(50) not null,
        price decimal(10,2) not null,
        netspeed int not null,
        validitydays int not null,
        FOREIGN KEY (customerid) references customer(customerid) on delete cascade
    );
     */

    //    View Table
    /*
    create view allCustomerInfo as
        select
            c.customerid,
            c.firstname,
            c.lastname,
            c.email,
            c.phone,
            a.street,
            a.city,
            a.state,
            a.zipcode,
            p.planid,
            p.planname,
            p.price,
            p.netspeed,
            p.validitydays
        FROM Customer c
        left join address a on c.customerid = a.customerid
        left join plan p on c.customerid = p.customerid;
     */



}
