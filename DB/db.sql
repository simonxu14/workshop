DROP TABLE IF EXISTS dynamic_workshop_historydata;
DROP TABLE IF EXISTS active_machine_historydata;
DROP TABLE IF EXISTS active_machine_tool_information;
DROP TABLE IF EXISTS dynamic_workshop_information;
DROP TABLE IF EXISTS machine_tool_information;
DROP TABLE IF EXISTS manufacture;
DROP TABLE IF EXISTS profession;
DROP TABLE IF EXISTS worker;
DROP TABLE IF EXISTS workshop;

CREATE TABLE `dynamic_workshop_historydata` (
  `ID` char(15) NOT NULL DEFAULT '',
  `workshopID` char(5) DEFAULT NULL,
  `temperature` int(11) NOT NULL,
  `humidity` int(11) DEFAULT NULL,
  `noise` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

CREATE TABLE `active_machine_historydata` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `machineID` char(20) DEFAULT NULL,
  `workshopID` char(20) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `moveTime` int(11) DEFAULT NULL,
  `restTime` int(11) DEFAULT NULL,
  `displacement` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=gbk;

CREATE TABLE `active_machine_tool_information` (
  `ID` char(50) NOT NULL DEFAULT '',
  `time` datetime NOT NULL,
  `moveTime` int(11) DEFAULT NULL,
  `restTime` int(11) DEFAULT NULL,
  `displacement` int(11) NOT NULL,
  `sTime` int(11) DEFAULT NULL,
  `machine` char(40) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

CREATE TABLE `dynamic_workshop_information` (
  `ID` char(15) NOT NULL DEFAULT '',
  `workshopID` char(5) DEFAULT NULL,
  `temperature` int(11) NOT NULL,
  `humidity` int(11) DEFAULT NULL,
  `noise` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

CREATE TABLE `machine_tool_information` (
  `ID` char(40) NOT NULL DEFAULT '',
  `type` char(20) DEFAULT NULL,
  `mNumber` char(10) DEFAULT NULL,
  `sNumber` char(30) DEFAULT NULL,
  `workshop` char(5) DEFAULT NULL,
  `manufacture` char(50) DEFAULT NULL,
  `pDate` datetime DEFAULT NULL,
  `workerID` char(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

CREATE TABLE `manufacture` (
  `ID` char(30) NOT NULL DEFAULT '',
  `name` char(50) DEFAULT NULL,
  `pancipal` char(10) DEFAULT NULL,
  `phone` char(20) DEFAULT NULL,
  `address` char(60) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

CREATE TABLE `profession` (
  `ID` char(20) NOT NULL DEFAULT '',
  `name` char(40) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

CREATE TABLE `worker` (
  `ID` char(10) NOT NULL DEFAULT '',
  `name` char(50) NOT NULL,
  `Authority` char(1) NOT NULL,
  `IDCard` char(18) NOT NULL,
  `profession` char(20) DEFAULT NULL,
  `pNumber` decimal(10,0) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `email` char(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `IDCard` (`IDCard`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

CREATE TABLE `workshop` (
  `ID` char(5) NOT NULL DEFAULT '',
  `type` char(10) DEFAULT NULL,
  `bTime` datetime DEFAULT NULL,
  `manufacture` char(30) DEFAULT NULL,
  `principal` char(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;