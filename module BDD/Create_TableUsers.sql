#------------------------------------------------------------
# Table: Users
#------------------------------------------------------------

CREATE TABLE Users(
        user_id      int (11) Auto_increment  NOT NULL ,
        login        Varchar (32) NOT NULL ,
        mot_passe    Varchar (32) NOT NULL ,
        created      Datetime ,
        personnel_id Int NOT NULL ,
        droit_id     Int ,
        PRIMARY KEY (user_id )
)ENGINE=InnoDB;

ALTER TABLE Users ADD CONSTRAINT FK_Users_personnel_id FOREIGN KEY (personnel_id) REFERENCES Personnels(personnel_id);
ALTER TABLE Users ADD CONSTRAINT FK_Users_droit_id FOREIGN KEY (droit_id) REFERENCES Droits(droit_id);