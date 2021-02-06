/*
Navicat MySQL Data Transfer

Source Server         : 47.114.160.96
Source Server Version : 50732
Source Host           : 47.114.160.96:3306
Source Database       : ry-vue

Target Server Type    : MYSQL
Target Server Version : 50732
File Encoding         : 65001

Date: 2020-12-20 14:24:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for note_note
-- ----------------------------
DROP TABLE IF EXISTS `cms_note`;
CREATE TABLE `cms_note` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `type` tinyint(4) NOT NULL,
  `content` longblob,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of note_note
-- ----------------------------

-- ----------------------------
-- Table structure for note_note_tag
-- ----------------------------
DROP TABLE IF EXISTS `cms_note_tag`;
CREATE TABLE `cms_note_tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `note_id` int(11) NOT NULL,
  `tag_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of note_note_tag
-- ----------------------------

-- ----------------------------
-- Table structure for note_tag
-- ----------------------------
DROP TABLE IF EXISTS `cms_tag`;
CREATE TABLE `cms_tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of note_tag
-- ----------------------------

-- ----------------------------
-- Table structure for note_user_note
-- ----------------------------
DROP TABLE IF EXISTS `cms_user_note`;
CREATE TABLE `cms_user_note` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `oss_user_id` int(11) NOT NULL,
  `note_note_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of note_user_note
-- ----------------------------
