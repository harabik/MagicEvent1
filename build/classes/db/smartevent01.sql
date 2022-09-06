-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 02 sep. 2022 à 23:26
-- Version du serveur :  10.4.17-MariaDB
-- Version de PHP : 8.0.0




SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `smartevent01`
--

-- --------------------------------------------------------

--
-- Structure de la table `animateur`
--

CREATE TABLE `animateur` (
  `id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `image` varchar(200) DEFAULT NULL,
  `num` varchar(50) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `gende` varchar(1) NOT NULL,
  `id_ville` int(11) NOT NULL,
  `id_region` int(11) NOT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `societe` varchar(100) DEFAULT NULL,
  `poste` varchar(100) DEFAULT NULL,
  `nbr_equipe` varchar(100) DEFAULT NULL,
  `description` varchar(500) NOT NULL,
  `prix` double(8,3) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `animateur`
--

INSERT INTO `animateur` (`id`, `id_user`, `nom`, `prenom`, `image`, `num`, `mail`, `gende`, `id_ville`, `id_region`, `adresse`, `societe`, `poste`, `nbr_equipe`, `description`, `prix`, `is_active`, `created_at`) VALUES
(1, 2, 'menjli', 'chiheb', 'rien', '99088487', 'chiheb.menjli1920@gmail.com', 'M', 78, 1, NULL, NULL, NULL, NULL, 'rien', NULL, 1, '2022-08-24 21:49:12');

-- --------------------------------------------------------

--
-- Structure de la table `bus_user`
--

CREATE TABLE `bus_user` (
  `id` int(11) NOT NULL,
  `bus_user_id` varchar(30) DEFAULT NULL,
  `login` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `num` int(8) NOT NULL,
  `cin` int(8) NOT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `verif_code` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bus_user`
--

INSERT INTO `bus_user` (`id`, `bus_user_id`, `login`, `password`, `role`, `nom`, `prenom`, `email`, `num`, `cin`, `adresse`, `is_active`, `created_at`, `verif_code`) VALUES
(1, 'ser1', 'chiheb_menjli', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-08-24 01:44:01', '00'),
(2, NULL, 'animateur1', '123456', 6, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, 'tunis', 1, '2022-08-24 21:44:37', NULL),
(3, NULL, 'espace1', '123456', 3, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-08-24 22:07:00', NULL),
(4, NULL, 'traiteur1', '123456', 1, 'karim', 'harrabi', 'karim.haraby', 99088487, 11655439, NULL, 1, '2022-08-24 22:14:43', NULL),
(5, 'NAS1', 'Nassim', '123456', 1, 'FATNASSI', 'Nassim', 'nassoum@gmail.com', 56370148, 11655439, NULL, 1, '2022-08-31 00:10:08', NULL),
(10, 'ch1234', 'chiheb1234', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 00:37:35', NULL),
(11, 'ch1234', 'chiheb1234', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 00:37:59', NULL),
(12, 'ch11', 'chiheb11', '123456', 1, 'houss', 'test', 'ch@gm.fgb', 99088487, 12345678, NULL, 1, '2022-09-01 01:40:23', NULL),
(13, 'ch12', 'chiheb112', '123456', 1, 'houss', 'test', 'ch@gm.fgb', 99088487, 12345678, NULL, 1, '2022-09-01 01:47:41', NULL),
(14, 'ch123', 'chiheb1123', '123456', 1, 'houss', 'test', 'ch@gm.fgb', 99088487, 12345678, NULL, 1, '2022-09-01 01:49:08', NULL),
(15, 'ch1234', 'chiheb11234', '123456', 1, 'houss', 'test', 'ch@gm.fgb', 99088487, 12345678, NULL, 1, '2022-09-01 01:52:25', NULL),
(16, 'ch12345', 'chiheb112345', '123456', 1, 'houss', 'test', 'ch@gm.fgb', 99088487, 12345678, NULL, 1, '2022-09-01 01:54:30', NULL),
(17, 'ch123456', 'chiheb1123456', '123456', 1, 'houss', 'test', 'ch@gm.fgb', 99088487, 12345678, NULL, 1, '2022-09-01 01:58:10', NULL),
(19, 'ch1234568', 'chiheb1234568', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 02:04:55', NULL),
(20, 'ch1230', 'chiheb1230', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 02:07:12', NULL),
(21, 'ch123', 'ch123', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 02:09:31', NULL),
(22, 'ch1234', 'ch1234', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 02:11:49', NULL),
(23, 'ch123', 'ch1230', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 02:17:57', NULL),
(24, 'ch123', 'ch1233', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 02:20:16', NULL),
(25, 'ch123', 'ch123', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 02:23:26', NULL),
(26, 'ch123', 'ch123', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 02:32:17', NULL),
(27, 'ch123', 'ch123', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 02:45:58', NULL),
(28, 'ch123', 'ch123', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 02:46:06', NULL),
(30, 'ch123', 'chiheb', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 15:53:50', NULL),
(31, 'ch123', 'chiheb000', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 17:00:33', NULL),
(32, 'ch123', 'chiheb001', '123456', 4, 'menjli', 'chiheb', 'chiheb.menjli1920@gmail.com', 99088487, 11655439, NULL, 1, '2022-09-01 17:12:07', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `bus_user_role`
--

CREATE TABLE `bus_user_role` (
  `id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  `user_role_id` int(11) NOT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bus_user_role`
--

INSERT INTO `bus_user_role` (`id`, `role_id`, `user_role_id`, `is_active`, `created_at`) VALUES
(1, 4, 1, 1, '2022-08-24 01:45:01');

-- --------------------------------------------------------

--
-- Structure de la table `choix`
--

CREATE TABLE `choix` (
  `id` int(11) NOT NULL,
  `id_location` int(11) NOT NULL,
  `id_materiel` int(11) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `choix` varchar(100) NOT NULL,
  `marque` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `prix` float(10,3) NOT NULL,
  `taille` varchar(500) NOT NULL,
  `qte` int(4) NOT NULL,
  `photo` varchar(200) NOT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `image` varchar(200) DEFAULT NULL,
  `num` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gende` varchar(1) NOT NULL,
  `id_ville` int(11) NOT NULL,
  `id_region` int(11) NOT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `societe` varchar(100) DEFAULT NULL,
  `poste` varchar(100) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `username`, `password`, `nom`, `prenom`, `image`, `num`, `email`, `gende`, `id_ville`, `id_region`, `adresse`, `societe`, `poste`, `is_active`, `created_at`) VALUES
(1, 'chiheb_menjli', '123456', 'menjli', 'chiheb', NULL, '99088487', 'chiheb.menjli1920@gmail.com', 'M', 1, 1, NULL, NULL, NULL, 1, '2022-08-24 21:52:10'),
(3, 'karim', '123456', 'karim', 'karim', 'RIEN', '123456789', 'karim@gmail.com', 'M', 1, 1, 'RIEN', NULL, NULL, 1, '2022-08-30 15:48:32'),
(6, 'chiheb123', '123456', 'Menjli', 'Chiheb', NULL, '123456701', 'chiheb@gmail.com', 'm', 1, 1, NULL, NULL, NULL, 1, '2022-09-01 03:15:45');

-- --------------------------------------------------------

--
-- Structure de la table `cree_event`
--

CREATE TABLE `cree_event` (
  `id` int(11) NOT NULL,
  `id_client` int(11) DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL,
  `id_eventt` int(11) DEFAULT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `adresse` varchar(500) DEFAULT NULL,
  `num` int(12) NOT NULL,
  `email` varchar(100) NOT NULL,
  `id_region` int(11) DEFAULT NULL,
  `id_ville` int(11) DEFAULT NULL,
  `societe` varchar(100) DEFAULT NULL,
  `nbr_invit` int(5) NOT NULL,
  `date_event` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `type_event` varchar(200) NOT NULL,
  `rapport` varchar(1000) DEFAULT NULL,
  `message` varchar(500) DEFAULT NULL,
  `rep_tele` int(1) NOT NULL DEFAULT 1,
  `id_role_user` int(11) DEFAULT NULL,
  `besoin_role_user` varchar(500) DEFAULT NULL,
  `budget` varchar(50) DEFAULT NULL,
  `qualite_eventt` varchar(50) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `creates_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `espace`
--

CREATE TABLE `espace` (
  `id` int(11) NOT NULL,
  `bus_user_id` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `nbr` int(5) NOT NULL,
  `adresse` varchar(500) NOT NULL,
  `id_region` int(11) NOT NULL,
  `id_ville` int(11) NOT NULL,
  `surface` varchar(50) NOT NULL,
  `id_bus` int(11) NOT NULL,
  `num_mo` int(8) NOT NULL,
  `num_fax` int(8) DEFAULT NULL,
  `prix` double(13,3) DEFAULT NULL,
  `photo` varchar(50) NOT NULL,
  `id_type_espace` int(8) NOT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `espace`
--

INSERT INTO `espace` (`id`, `bus_user_id`, `nom`, `nbr`, `adresse`, `id_region`, `id_ville`, `surface`, `id_bus`, `num_mo`, `num_fax`, `prix`, `photo`, `id_type_espace`, `is_active`, `created_at`) VALUES
(1, 3, 'menjli', 500, 'tunis', 1, 80, '500 m2', 0, 99088487, NULL, NULL, 'rien', 1, 1, '2022-08-24 22:09:13');

-- --------------------------------------------------------

--
-- Structure de la table `eventt`
--

CREATE TABLE `eventt` (
  `id` int(11) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `photo` varchar(200) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `eventt`
--

INSERT INTO `eventt` (`id`, `nom`, `description`, `photo`, `is_active`, `created_at`) VALUES
(1, 'Mariages', NULL, NULL, 1, '2022-08-24 01:22:25'),
(2, 'Anniversaires', NULL, NULL, 1, '2022-08-24 01:22:25'),
(3, 'Soirées privées', NULL, NULL, 1, '2022-08-24 01:22:25'),
(4, 'Séminaires', NULL, NULL, 1, '2022-08-24 01:22:25'),
(5, 'Conférences', NULL, NULL, 1, '2022-08-24 01:22:25'),
(6, 'Lancement de produit', NULL, NULL, 1, '2022-08-24 01:22:25'),
(7, 'Net working', NULL, NULL, 1, '2022-08-24 01:22:25'),
(8, 'Arbre de Noël', NULL, NULL, 1, '2022-08-24 01:22:25'),
(9, 'Formations', NULL, NULL, 1, '2022-08-24 01:22:25'),
(10, 'Incentive', NULL, NULL, 1, '2022-08-24 01:22:25'),
(11, 'Soirées de gala', NULL, NULL, 1, '2022-08-24 01:22:25'),
(12, 'Cocktails d\'entreprises', NULL, NULL, 1, '2022-08-24 01:22:25'),
(13, 'Team Building', NULL, NULL, 1, '2022-08-24 01:22:25'),
(14, 'Salons', NULL, NULL, 1, '2022-08-24 01:22:25'),
(15, 'Soirées d\'entreprise', NULL, NULL, 1, '2022-08-24 01:22:25'),
(16, 'Inaugurations', NULL, NULL, 1, '2022-08-24 01:22:25'),
(17, 'Défilés de mode', NULL, NULL, 1, '2022-08-24 01:22:25'),
(18, 'Enterrement', NULL, NULL, 1, '2022-08-24 01:22:25');

-- --------------------------------------------------------

--
-- Structure de la table `language`
--

CREATE TABLE `language` (
  `id` int(11) NOT NULL,
  `langue` varchar(50) NOT NULL,
  `short_code` varchar(50) NOT NULL,
  `contry_code` varchar(50) NOT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `location`
--

CREATE TABLE `location` (
  `id` int(11) NOT NULL,
  `bus_user_id` int(11) NOT NULL,
  `nom_societe` varchar(100) NOT NULL,
  `adresse` varchar(500) NOT NULL,
  `email` varchar(200) NOT NULL,
  `id_region` int(11) NOT NULL,
  `id_ville` int(11) NOT NULL,
  `id_bus` int(11) NOT NULL,
  `num_mo` int(8) NOT NULL,
  `num_fax` int(8) DEFAULT NULL,
  `photo` varchar(200) NOT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `materiel`
--

CREATE TABLE `materiel` (
  `id` int(11) NOT NULL,
  `bus_user_id` int(11) NOT NULL,
  `id_location` int(11) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `id_choix` int(11) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `photo` varchar(200) NOT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `photographe`
--

CREATE TABLE `photographe` (
  `id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `image` varchar(200) DEFAULT NULL,
  `num` varchar(50) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `gende` varchar(1) NOT NULL,
  `id_ville` int(11) NOT NULL,
  `id_region` int(11) NOT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `societe` varchar(100) DEFAULT NULL,
  `poste` varchar(100) DEFAULT NULL,
  `nbr_equipe` varchar(100) DEFAULT NULL,
  `description` varchar(500) NOT NULL,
  `prix` double(8,3) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `region`
--

CREATE TABLE `region` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `description` text DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `region`
--

INSERT INTO `region` (`id`, `nom`, `description`, `is_active`, `created_at`) VALUES
(1, 'TUNIS', NULL, 1, '2022-08-24 00:05:22'),
(2, 'Ben Arous', NULL, 1, '2022-08-24 00:06:01'),
(3, 'Ariana', NULL, 1, '2022-08-24 00:06:16'),
(4, 'La Manouba', NULL, 1, '2022-08-24 00:07:07');

-- --------------------------------------------------------

--
-- Structure de la table `reserv_animateur`
--

CREATE TABLE `reserv_animateur` (
  `id` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  `id_animateur` int(11) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `date_reser` date NOT NULL,
  `nbr_jours` int(2) DEFAULT NULL,
  `prix` float(10,3) DEFAULT NULL,
  `avance` float(10,3) DEFAULT NULL,
  `verif` varchar(10) DEFAULT NULL,
  `paye_avance` varchar(10) DEFAULT NULL,
  `paye` varchar(10) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `reserv_animateur`
--

INSERT INTO `reserv_animateur` (`id`, `id_client`, `id_animateur`, `id_eventt`, `date_reser`, `nbr_jours`, `prix`, `avance`, `verif`, `paye_avance`, `paye`, `is_active`, `created_at`) VALUES
(1, 1, 1, 1, '2022-08-31', 1, NULL, NULL, NULL, NULL, NULL, 1, '2022-08-24 21:53:22');

-- --------------------------------------------------------

--
-- Structure de la table `reserv_espace`
--

CREATE TABLE `reserv_espace` (
  `id` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  `id_espace` int(11) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `date_reser` date NOT NULL,
  `nbr_jours` int(2) DEFAULT NULL,
  `prix` float(10,3) DEFAULT NULL,
  `avance` float(10,3) DEFAULT NULL,
  `verif` varchar(10) DEFAULT NULL,
  `paye_avance` varchar(10) DEFAULT NULL,
  `paye` varchar(10) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `reserv_espace`
--

INSERT INTO `reserv_espace` (`id`, `id_client`, `id_espace`, `id_eventt`, `date_reser`, `nbr_jours`, `prix`, `avance`, `verif`, `paye_avance`, `paye`, `is_active`, `created_at`) VALUES
(1, 1, 1, 1, '2022-08-31', NULL, NULL, NULL, NULL, NULL, NULL, 1, '2022-08-24 22:11:44');

-- --------------------------------------------------------

--
-- Structure de la table `reserv_location`
--

CREATE TABLE `reserv_location` (
  `id` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  `id_materiel` int(11) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `date_reser` date NOT NULL,
  `nbr_jours` int(2) DEFAULT NULL,
  `prix` float(10,3) DEFAULT NULL,
  `avance` float(10,3) DEFAULT NULL,
  `verif` varchar(10) DEFAULT NULL,
  `paye_avance` varchar(10) DEFAULT NULL,
  `paye` varchar(10) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `reserv_photographe`
--

CREATE TABLE `reserv_photographe` (
  `id` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  `id_photographe` int(11) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `date_reser` date NOT NULL,
  `nbr_jours` int(2) DEFAULT NULL,
  `prix` float(10,3) DEFAULT NULL,
  `avance` float(10,3) DEFAULT NULL,
  `verif` varchar(10) DEFAULT NULL,
  `paye_avance` varchar(10) DEFAULT NULL,
  `paye` varchar(10) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `reserv_serveur`
--

CREATE TABLE `reserv_serveur` (
  `id` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  `id_service` int(11) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `date_reser` date NOT NULL,
  `nbr_jours` int(2) DEFAULT NULL,
  `prix` float(10,3) DEFAULT NULL,
  `avance` float(10,3) DEFAULT NULL,
  `verif` varchar(10) DEFAULT NULL,
  `paye_avance` varchar(10) DEFAULT NULL,
  `paye` varchar(10) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `reserv_traiteur`
--

CREATE TABLE `reserv_traiteur` (
  `id` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  `id_service` int(11) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `date_reser` date NOT NULL,
  `nbr_jours` int(2) DEFAULT NULL,
  `prix` float(10,3) DEFAULT NULL,
  `avance` float(10,3) DEFAULT NULL,
  `verif` varchar(10) DEFAULT NULL,
  `paye_avance` varchar(10) DEFAULT NULL,
  `paye` varchar(10) DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `reserv_traiteur`
--

INSERT INTO `reserv_traiteur` (`id`, `id_client`, `id_service`, `id_eventt`, `date_reser`, `nbr_jours`, `prix`, `avance`, `verif`, `paye_avance`, `paye`, `is_active`, `created_at`) VALUES
(1, 1, 124, 1, '2022-08-31', NULL, NULL, NULL, NULL, NULL, NULL, 1, '2022-08-24 22:45:21');

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `description` text DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `role`
--

INSERT INTO `role` (`id`, `nom`, `description`, `is_active`, `created_at`) VALUES
(1, 'Traiteur', NULL, 1, '2022-08-24 01:40:05'),
(2, 'Location', NULL, 1, '2022-08-24 01:40:05'),
(3, 'Espace', NULL, 1, '2022-08-24 01:40:05'),
(4, 'Serveur', NULL, 1, '2022-08-24 01:40:05'),
(5, 'Photographe', NULL, 1, '2022-08-24 01:40:05'),
(6, 'Animateur', NULL, 1, '2022-08-24 01:40:05');

-- --------------------------------------------------------

--
-- Structure de la table `serveur`
--

CREATE TABLE `serveur` (
  `id` int(11) NOT NULL,
  `bus_user_id` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `cin` varchar(8) NOT NULL,
  `date_naissance` date NOT NULL,
  `gende` varchar(1) NOT NULL,
  `langue` int(11) NOT NULL,
  `experience` varchar(200) NOT NULL,
  `id_region` int(11) NOT NULL,
  `id_ville` int(11) NOT NULL,
  `adresse` varchar(100) NOT NULL,
  `num_mo` varchar(8) NOT NULL,
  `num_fax` varchar(8) DEFAULT NULL,
  `photo` varchar(200) NOT NULL,
  `photo_pro` varchar(200) NOT NULL,
  `ph_cin_r` varchar(200) NOT NULL,
  `ph_cin_v` varchar(200) NOT NULL,
  `ph_certif` varchar(200) NOT NULL,
  `taille` varchar(100) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `serveur`
--

INSERT INTO `serveur` (`id`, `bus_user_id`, `nom`, `cin`, `date_naissance`, `gende`, `langue`, `experience`, `id_region`, `id_ville`, `adresse`, `num_mo`, `num_fax`, `photo`, `photo_pro`, `ph_cin_r`, `ph_cin_v`, `ph_certif`, `taille`, `id_eventt`, `is_active`, `created_at`) VALUES
(1, 1, 'chiheb', '11655439', '1997-04-23', 'M', 1, 'rien', 1, 80, '7 rue 42216 ghdir golla hrairia tunis', '99088487', NULL, 'rien', 'rien', 'rien', 'rien', 'rien', '180', 1, 1, '2022-08-24 01:48:17');

-- --------------------------------------------------------

--
-- Structure de la table `service`
--

CREATE TABLE `service` (
  `id` int(11) NOT NULL,
  `bus_user_id` int(11) NOT NULL,
  `id_traiteur` int(11) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `discription` varchar(500) NOT NULL,
  `produit` varchar(500) NOT NULL,
  `prix` float(10,3) NOT NULL,
  `photo` varchar(200) NOT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `service`
--

INSERT INTO `service` (`id`, `bus_user_id`, `id_traiteur`, `id_eventt`, `discription`, `produit`, `prix`, `photo`, `is_active`, `created_at`) VALUES
(18, 4, 1, 2, 'rien ', 'rien', 0.000, 'rien', 1, '2022-08-24 22:37:18'),
(124, 4, 1, 3, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(125, 4, 1, 4, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(126, 4, 1, 5, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(127, 4, 1, 6, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(128, 4, 1, 7, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(129, 4, 1, 8, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(130, 4, 1, 9, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(131, 4, 1, 10, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(132, 4, 1, 11, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(133, 4, 1, 12, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(134, 4, 1, 13, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(135, 4, 1, 14, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12'),
(136, 4, 1, 15, 'rien', 'rien', 0.000, 'rien', 1, '2022-08-24 22:44:12');

-- --------------------------------------------------------

--
-- Structure de la table `spec_serveur`
--

CREATE TABLE `spec_serveur` (
  `id` int(11) NOT NULL,
  `id_serveur` int(11) NOT NULL,
  `bus_user_id` int(11) NOT NULL,
  `id_eventt` int(11) NOT NULL,
  `discreption` varchar(100) NOT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `traiteur`
--

CREATE TABLE `traiteur` (
  `id` int(11) NOT NULL,
  `bus_user_id` int(11) NOT NULL,
  `nom_societe` varchar(100) NOT NULL,
  `adresse` varchar(500) NOT NULL,
  `id_region` int(11) NOT NULL,
  `id_ville` int(11) NOT NULL,
  `id_bus` int(11) NOT NULL,
  `num_mo` int(8) NOT NULL,
  `num_fax` int(8) DEFAULT NULL,
  `photo` varchar(200) NOT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `traiteur`
--

INSERT INTO `traiteur` (`id`, `bus_user_id`, `nom_societe`, `adresse`, `id_region`, `id_ville`, `id_bus`, `num_mo`, `num_fax`, `photo`, `is_active`, `created_at`) VALUES
(1, 4, 'event', 'tunis', 2, 108, 0, 99088487, NULL, 'rien', 1, '2022-08-23 23:00:00');

-- --------------------------------------------------------

--
-- Structure de la table `type_espace`
--

CREATE TABLE `type_espace` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `description` text DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `type_espace`
--

INSERT INTO `type_espace` (`id`, `nom`, `description`, `is_active`, `created_at`) VALUES
(1, 'Salle de fête', NULL, 1, '2022-08-24 01:35:29'),
(2, 'maison d\'hôtes', NULL, 1, '2022-08-24 01:35:29'),
(3, 'salle de conférence', NULL, 1, '2022-08-24 01:35:29'),
(4, 'hôtel', NULL, 1, '2022-08-24 01:35:29'),
(5, 'café', NULL, 1, '2022-08-24 01:35:29'),
(6, 'espace vide', NULL, 1, '2022-08-24 01:35:29');

-- --------------------------------------------------------

--
-- Structure de la table `ville`
--

CREATE TABLE `ville` (
  `id` int(11) NOT NULL,
  `id_region` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `description` text DEFAULT NULL,
  `is_active` int(1) NOT NULL DEFAULT 1,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `ville`
--

INSERT INTO `ville` (`id`, `id_region`, `nom`, `description`, `is_active`, `created_at`) VALUES
(1, 1, 'Bab Bhar', NULL, 1, '2022-08-24 00:22:19'),
(77, 1, 'Bab Souika', NULL, 1, '2022-08-24 00:32:52'),
(78, 1, 'Carthage', NULL, 1, '2022-08-24 00:36:57'),
(79, 1, 'Cite El Khadra', NULL, 1, '2022-08-24 00:36:57'),
(80, 1, 'El Hrairia', NULL, 1, '2022-08-24 00:36:57'),
(81, 1, 'El Menzah', NULL, 1, '2022-08-24 00:36:57'),
(82, 1, 'El Ouerdia', NULL, 1, '2022-08-24 00:36:57'),
(83, 1, 'Ezzouhour', NULL, 1, '2022-08-24 00:36:57'),
(84, 1, 'El Kabbaria', NULL, 1, '2022-08-24 00:36:57'),
(85, 1, 'El Omrane', NULL, 1, '2022-08-24 00:36:57'),
(86, 1, 'Essijoumi', NULL, 1, '2022-08-24 00:36:57'),
(87, 1, 'El Kram', NULL, 1, '2022-08-24 00:36:57'),
(88, 1, 'El Omrane Superieur', NULL, 1, '2022-08-24 00:36:57'),
(89, 1, 'Ettahrir', NULL, 1, '2022-08-24 00:36:57'),
(90, 1, 'Jebel Jelloud', NULL, 1, '2022-08-24 00:36:57'),
(91, 1, 'La Goulette', NULL, 1, '2022-08-24 00:36:57'),
(92, 1, 'La Marsa', NULL, 1, '2022-08-24 00:36:57'),
(93, 1, 'La Medina', NULL, 1, '2022-08-24 00:36:57'),
(94, 1, 'Le Bardo', NULL, 1, '2022-08-24 00:36:57'),
(95, 1, 'Sidi El Bechir', NULL, 1, '2022-08-24 00:36:57'),
(96, 1, 'Sidi Hassine', NULL, 1, '2022-08-24 00:36:57'),
(97, 2, 'Ben Arous', NULL, 1, '2022-08-24 00:40:05'),
(98, 2, 'Bou Mhel El Bassatine', NULL, 1, '2022-08-24 00:40:05'),
(99, 2, 'El Mourouj', NULL, 1, '2022-08-24 00:40:05'),
(100, 2, 'Ezzahra', NULL, 1, '2022-08-24 00:40:05'),
(101, 2, 'Fouchana', NULL, 1, '2022-08-24 00:40:05'),
(102, 2, 'Hammam Chatt', NULL, 1, '2022-08-24 00:40:05'),
(103, 2, 'Hammam Lif', NULL, 1, '2022-08-24 00:40:05'),
(104, 2, 'Megrine', NULL, 1, '2022-08-24 00:40:05'),
(105, 2, 'Mohamadia', NULL, 1, '2022-08-24 00:40:05'),
(106, 2, 'Mornag', NULL, 1, '2022-08-24 00:40:05'),
(107, 2, 'Nouvelle Medina', NULL, 1, '2022-08-24 00:40:05'),
(108, 2, 'Rades', NULL, 1, '2022-08-24 00:40:05'),
(109, 3, 'Ariana Ville', NULL, 1, '2022-08-24 00:41:52'),
(110, 3, 'Ettadhamen', NULL, 1, '2022-08-24 00:41:52'),
(111, 3, 'Kalaat Landlous', NULL, 1, '2022-08-24 00:41:52'),
(112, 3, 'La Soukra', NULL, 1, '2022-08-24 00:41:52'),
(113, 3, 'Mnihla', NULL, 1, '2022-08-24 00:41:52'),
(114, 3, 'Raoued', NULL, 1, '2022-08-24 00:41:52'),
(115, 3, 'Sidi Thabet', NULL, 1, '2022-08-24 00:41:52'),
(116, 4, 'Borj El Amri', NULL, 1, '2022-08-24 00:45:44'),
(117, 4, 'Douar Hicher', NULL, 1, '2022-08-24 00:45:44'),
(118, 4, 'El Battan', NULL, 1, '2022-08-24 00:45:44'),
(119, 4, 'Jedaida', NULL, 1, '2022-08-24 00:45:44'),
(120, 4, 'Mannouba', NULL, 1, '2022-08-24 00:45:44'),
(121, 4, 'Mornaguia', NULL, 1, '2022-08-24 00:45:44'),
(122, 4, 'Oued Ellil', NULL, 1, '2022-08-24 00:45:44'),
(123, 4, 'Tebourba', NULL, 1, '2022-08-24 00:45:44');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `animateur`
--
ALTER TABLE `animateur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_user` (`id_user`) USING BTREE,
  ADD KEY `id_ville` (`id_ville`) USING BTREE,
  ADD KEY `id_region` (`id_region`) USING BTREE;

--
-- Index pour la table `bus_user`
--
ALTER TABLE `bus_user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `role` (`role`) USING BTREE;

--
-- Index pour la table `bus_user_role`
--
ALTER TABLE `bus_user_role`
  ADD PRIMARY KEY (`id`),
  ADD KEY `role_id` (`role_id`) USING BTREE,
  ADD KEY `user_role_id` (`user_role_id`) USING BTREE;

--
-- Index pour la table `choix`
--
ALTER TABLE `choix`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_location` (`id_location`) USING BTREE,
  ADD KEY `id_eventt` (`id_eventt`) USING BTREE,
  ADD KEY `id_materiel` (`id_materiel`) USING BTREE;

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_ville` (`id_ville`) USING BTREE,
  ADD KEY `id_region` (`id_region`) USING BTREE;

--
-- Index pour la table `cree_event`
--
ALTER TABLE `cree_event`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_client` (`id_client`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id` (`id_eventt`,`id_region`,`id_ville`,`id_role_user`) USING BTREE,
  ADD KEY `id_region` (`id_region`),
  ADD KEY `id_ville` (`id_ville`),
  ADD KEY `id_role_user` (`id_role_user`);

--
-- Index pour la table `espace`
--
ALTER TABLE `espace`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_region` (`id_region`) USING BTREE,
  ADD KEY `id_ville` (`id_ville`) USING BTREE,
  ADD KEY `id_bus` (`id_bus`) USING BTREE,
  ADD KEY `bus_user_id` (`bus_user_id`) USING BTREE,
  ADD KEY `id_type_espace` (`id_type_espace`) USING BTREE;

--
-- Index pour la table `eventt`
--
ALTER TABLE `eventt`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `language`
--
ALTER TABLE `language`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bus_user_id` (`bus_user_id`) USING BTREE,
  ADD KEY `id_region` (`id_region`) USING BTREE,
  ADD KEY `id_ville` (`id_ville`) USING BTREE;

--
-- Index pour la table `materiel`
--
ALTER TABLE `materiel`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_location` (`id_location`) USING BTREE,
  ADD KEY `bus_user_id` (`bus_user_id`) USING BTREE,
  ADD KEY `id_choix` (`id_choix`) USING BTREE,
  ADD KEY `id_eventt` (`id_eventt`) USING BTREE;

--
-- Index pour la table `photographe`
--
ALTER TABLE `photographe`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_user` (`id_user`) USING BTREE,
  ADD KEY `id_ville` (`id_ville`) USING BTREE,
  ADD KEY `id_region` (`id_region`) USING BTREE;

--
-- Index pour la table `region`
--
ALTER TABLE `region`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `reserv_animateur`
--
ALTER TABLE `reserv_animateur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_client` (`id_client`) USING BTREE,
  ADD KEY `id_eventt` (`id_eventt`) USING BTREE,
  ADD KEY `id_animateur` (`id_animateur`) USING BTREE;

--
-- Index pour la table `reserv_espace`
--
ALTER TABLE `reserv_espace`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_client` (`id_client`) USING BTREE,
  ADD KEY `id_espace` (`id_espace`) USING BTREE,
  ADD KEY `id_eventt` (`id_eventt`) USING BTREE;

--
-- Index pour la table `reserv_location`
--
ALTER TABLE `reserv_location`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_client` (`id_client`) USING BTREE,
  ADD KEY `id_materiel` (`id_materiel`) USING BTREE,
  ADD KEY `id_eventt` (`id_eventt`) USING BTREE;

--
-- Index pour la table `reserv_photographe`
--
ALTER TABLE `reserv_photographe`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_client` (`id_client`) USING BTREE,
  ADD KEY `id_photographe` (`id_photographe`) USING BTREE,
  ADD KEY `id_eventt` (`id_eventt`) USING BTREE;

--
-- Index pour la table `reserv_serveur`
--
ALTER TABLE `reserv_serveur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_client` (`id_client`) USING BTREE,
  ADD KEY `id_service` (`id_service`) USING BTREE,
  ADD KEY `id_eventt` (`id_eventt`) USING BTREE;

--
-- Index pour la table `reserv_traiteur`
--
ALTER TABLE `reserv_traiteur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_eventt` (`id_eventt`) USING BTREE,
  ADD KEY `id_client` (`id_client`) USING BTREE,
  ADD KEY `id_service` (`id_service`) USING BTREE;

--
-- Index pour la table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `serveur`
--
ALTER TABLE `serveur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bus_user_id` (`bus_user_id`) USING BTREE,
  ADD KEY `id_region` (`id_region`) USING BTREE,
  ADD KEY `id_ville` (`id_ville`) USING BTREE;

--
-- Index pour la table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bus_user_id` (`bus_user_id`) USING BTREE,
  ADD KEY `id_traiteur` (`id_traiteur`) USING BTREE,
  ADD KEY `id_eventt` (`id_eventt`) USING BTREE;

--
-- Index pour la table `spec_serveur`
--
ALTER TABLE `spec_serveur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bus_user_id` (`bus_user_id`) USING BTREE,
  ADD KEY `id_eventt` (`id_eventt`) USING BTREE,
  ADD KEY `id_serveur` (`id_serveur`) USING BTREE;

--
-- Index pour la table `traiteur`
--
ALTER TABLE `traiteur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bus_user_id` (`bus_user_id`) USING BTREE,
  ADD KEY `id_region` (`id_region`) USING BTREE,
  ADD KEY `id_ville` (`id_ville`) USING BTREE;

--
-- Index pour la table `type_espace`
--
ALTER TABLE `type_espace`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `ville`
--
ALTER TABLE `ville`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_region` (`id_region`) USING BTREE;

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `animateur`
--
ALTER TABLE `animateur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `bus_user`
--
ALTER TABLE `bus_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT pour la table `bus_user_role`
--
ALTER TABLE `bus_user_role`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `choix`
--
ALTER TABLE `choix`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `cree_event`
--
ALTER TABLE `cree_event`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `espace`
--
ALTER TABLE `espace`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `eventt`
--
ALTER TABLE `eventt`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT pour la table `language`
--
ALTER TABLE `language`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `location`
--
ALTER TABLE `location`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `materiel`
--
ALTER TABLE `materiel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `photographe`
--
ALTER TABLE `photographe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `region`
--
ALTER TABLE `region`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `reserv_animateur`
--
ALTER TABLE `reserv_animateur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `reserv_espace`
--
ALTER TABLE `reserv_espace`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `reserv_location`
--
ALTER TABLE `reserv_location`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `reserv_photographe`
--
ALTER TABLE `reserv_photographe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `reserv_serveur`
--
ALTER TABLE `reserv_serveur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `reserv_traiteur`
--
ALTER TABLE `reserv_traiteur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `role`
--
ALTER TABLE `role`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `serveur`
--
ALTER TABLE `serveur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `service`
--
ALTER TABLE `service`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=137;

--
-- AUTO_INCREMENT pour la table `spec_serveur`
--
ALTER TABLE `spec_serveur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `traiteur`
--
ALTER TABLE `traiteur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `type_espace`
--
ALTER TABLE `type_espace`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `ville`
--
ALTER TABLE `ville`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `animateur`
--
ALTER TABLE `animateur`
  ADD CONSTRAINT `animateur_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `bus_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `animateur_ibfk_2` FOREIGN KEY (`id_ville`) REFERENCES `ville` (`id`),
  ADD CONSTRAINT `animateur_ibfk_3` FOREIGN KEY (`id_region`) REFERENCES `region` (`id`);

--
-- Contraintes pour la table `bus_user`
--
ALTER TABLE `bus_user`
  ADD CONSTRAINT `bus_user_ibfk_1` FOREIGN KEY (`role`) REFERENCES `role` (`id`);

--
-- Contraintes pour la table `bus_user_role`
--
ALTER TABLE `bus_user_role`
  ADD CONSTRAINT `bus_user_role_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bus_user_role_ibfk_2` FOREIGN KEY (`user_role_id`) REFERENCES `bus_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `choix`
--
ALTER TABLE `choix`
  ADD CONSTRAINT `choix_ibfk_1` FOREIGN KEY (`id_materiel`) REFERENCES `materiel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `choix_ibfk_2` FOREIGN KEY (`id_location`) REFERENCES `location` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `choix_ibfk_3` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `client_ibfk_1` FOREIGN KEY (`id_ville`) REFERENCES `ville` (`id`),
  ADD CONSTRAINT `client_ibfk_2` FOREIGN KEY (`id_region`) REFERENCES `region` (`id`);

--
-- Contraintes pour la table `cree_event`
--
ALTER TABLE `cree_event`
  ADD CONSTRAINT `cree_event_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `bus_user` (`id`),
  ADD CONSTRAINT `cree_event_ibfk_2` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`),
  ADD CONSTRAINT `cree_event_ibfk_3` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`),
  ADD CONSTRAINT `cree_event_ibfk_4` FOREIGN KEY (`id_region`) REFERENCES `region` (`id`),
  ADD CONSTRAINT `cree_event_ibfk_5` FOREIGN KEY (`id_ville`) REFERENCES `ville` (`id`),
  ADD CONSTRAINT `cree_event_ibfk_6` FOREIGN KEY (`id_role_user`) REFERENCES `role` (`id`);

--
-- Contraintes pour la table `espace`
--
ALTER TABLE `espace`
  ADD CONSTRAINT `espace_ibfk_1` FOREIGN KEY (`id_type_espace`) REFERENCES `type_espace` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `espace_ibfk_2` FOREIGN KEY (`id_ville`) REFERENCES `ville` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `espace_ibfk_3` FOREIGN KEY (`id_region`) REFERENCES `region` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `espace_ibfk_4` FOREIGN KEY (`bus_user_id`) REFERENCES `bus_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `location`
--
ALTER TABLE `location`
  ADD CONSTRAINT `location_ibfk_1` FOREIGN KEY (`id_ville`) REFERENCES `ville` (`id`),
  ADD CONSTRAINT `location_ibfk_2` FOREIGN KEY (`bus_user_id`) REFERENCES `bus_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `location_ibfk_3` FOREIGN KEY (`id_region`) REFERENCES `region` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `materiel`
--
ALTER TABLE `materiel`
  ADD CONSTRAINT `materiel_ibfk_1` FOREIGN KEY (`bus_user_id`) REFERENCES `bus_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `materiel_ibfk_2` FOREIGN KEY (`id_location`) REFERENCES `location` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `materiel_ibfk_3` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `reserv_animateur`
--
ALTER TABLE `reserv_animateur`
  ADD CONSTRAINT `reserv_animateur_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reserv_animateur_ibfk_2` FOREIGN KEY (`id_animateur`) REFERENCES `animateur` (`id`),
  ADD CONSTRAINT `reserv_animateur_ibfk_3` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`);

--
-- Contraintes pour la table `reserv_espace`
--
ALTER TABLE `reserv_espace`
  ADD CONSTRAINT `reserv_espace_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reserv_espace_ibfk_2` FOREIGN KEY (`id_espace`) REFERENCES `espace` (`id`),
  ADD CONSTRAINT `reserv_espace_ibfk_3` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`);

--
-- Contraintes pour la table `reserv_location`
--
ALTER TABLE `reserv_location`
  ADD CONSTRAINT `reserv_location_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reserv_location_ibfk_2` FOREIGN KEY (`id_materiel`) REFERENCES `materiel` (`id`),
  ADD CONSTRAINT `reserv_location_ibfk_3` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`);

--
-- Contraintes pour la table `reserv_photographe`
--
ALTER TABLE `reserv_photographe`
  ADD CONSTRAINT `reserv_photographe_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reserv_photographe_ibfk_2` FOREIGN KEY (`id_photographe`) REFERENCES `photographe` (`id`),
  ADD CONSTRAINT `reserv_photographe_ibfk_3` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`);

--
-- Contraintes pour la table `reserv_serveur`
--
ALTER TABLE `reserv_serveur`
  ADD CONSTRAINT `reserv_serveur_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reserv_serveur_ibfk_2` FOREIGN KEY (`id_service`) REFERENCES `serveur` (`id`),
  ADD CONSTRAINT `reserv_serveur_ibfk_3` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`);

--
-- Contraintes pour la table `reserv_traiteur`
--
ALTER TABLE `reserv_traiteur`
  ADD CONSTRAINT `reserv_traiteur_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reserv_traiteur_ibfk_2` FOREIGN KEY (`id_service`) REFERENCES `service` (`id`),
  ADD CONSTRAINT `reserv_traiteur_ibfk_3` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`);

--
-- Contraintes pour la table `serveur`
--
ALTER TABLE `serveur`
  ADD CONSTRAINT `serveur_ibfk_1` FOREIGN KEY (`bus_user_id`) REFERENCES `bus_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `serveur_ibfk_2` FOREIGN KEY (`id_region`) REFERENCES `region` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `serveur_ibfk_3` FOREIGN KEY (`id_ville`) REFERENCES `ville` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `serveur_ibfk_4` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `service`
--
ALTER TABLE `service`
  ADD CONSTRAINT `service_ibfk_2` FOREIGN KEY (`id_traiteur`) REFERENCES `traiteur` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `service_ibfk_3` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `service_ibfk_4` FOREIGN KEY (`bus_user_id`) REFERENCES `bus_user` (`id`) ON UPDATE CASCADE;

--
-- Contraintes pour la table `spec_serveur`
--
ALTER TABLE `spec_serveur`
  ADD CONSTRAINT `spec_serveur_ibfk_1` FOREIGN KEY (`id_eventt`) REFERENCES `eventt` (`id`),
  ADD CONSTRAINT `spec_serveur_ibfk_2` FOREIGN KEY (`id_serveur`) REFERENCES `serveur` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `traiteur`
--
ALTER TABLE `traiteur`
  ADD CONSTRAINT `traiteur_ibfk_1` FOREIGN KEY (`bus_user_id`) REFERENCES `bus_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `traiteur_ibfk_2` FOREIGN KEY (`id_ville`) REFERENCES `ville` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `traiteur_ibfk_3` FOREIGN KEY (`id_region`) REFERENCES `region` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `ville`
--
ALTER TABLE `ville`
  ADD CONSTRAINT `ville_ibfk_1` FOREIGN KEY (`id_region`) REFERENCES `region` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
