-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 22, 2020 at 02:30 PM
-- Server version: 10.3.15-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_databaz`
--

-- --------------------------------------------------------

--
-- Table structure for table `perdorus`
--

CREATE TABLE `perdorus` (
  `Emer` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perdorus`
--

INSERT INTO `perdorus` (`Emer`, `Password`) VALUES
('Dardan', '1234Vlore');

-- --------------------------------------------------------

--
-- Table structure for table `te_dhenatklient`
--

CREATE TABLE `te_dhenatklient` (
  `Emer` varchar(50) NOT NULL,
  `Mbiemer` varchar(50) NOT NULL,
  `Shuma` varchar(50) NOT NULL,
  `Adressa` varchar(50) NOT NULL,
  `Emer_babai` varchar(50) NOT NULL,
  `ID` int(11) NOT NULL,
  `Datelindja` varchar(12) NOT NULL,
  `Monedha` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `te_dhenatklient`
--

INSERT INTO `te_dhenatklient` (`Emer`, `Mbiemer`, `Shuma`, `Adressa`, `Emer_babai`, `ID`, `Datelindja`, `Monedha`) VALUES
('Dardan', 'Madani', '4000', '1234 vlore', 'Bujar', 10, 'vlore', 'e'),
('Drinlon', 'Madani', '24000', 'tiran', 'Bujar', 11, 'dhjetor', '$'),
('nok', 'noku', '35000', 'partizani', 'Ismet', 12, 'janar', '$'),
('Xhoni', 'Komini', '5000', 'vau i dejes', 'kosta', 13, '3 qershor', 'L'),
('Arnel', 'Bencora', '3000', 'rrrrrrr', 'Artur', 14, '3qershor', '$'),
('redian', 'ismailaj', '6700', 'hjkhkkhk', 'bbbb', 15, '7', 'l');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `te_dhenatklient`
--
ALTER TABLE `te_dhenatklient`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `te_dhenatklient`
--
ALTER TABLE `te_dhenatklient`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
