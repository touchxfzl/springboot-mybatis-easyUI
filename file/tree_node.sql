/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-09-04 20:35:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tree_node
-- ----------------------------
DROP TABLE IF EXISTS `tree_node`;
CREATE TABLE `tree_node` (
  `id` int(11) NOT NULL,
  `text` varchar(50) NOT NULL,
  `parentid` int(11) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tree_node
-- ----------------------------
INSERT INTO `tree_node` VALUES ('1', '权限管理', null, 'closed');
INSERT INTO `tree_node` VALUES ('2', '系统管理', null, null);
INSERT INTO `tree_node` VALUES ('3', '用户管理', null, '');
INSERT INTO `tree_node` VALUES ('4', '楚河', '3', '');
INSERT INTO `tree_node` VALUES ('5', '汉界', '3', null);
INSERT INTO `tree_node` VALUES ('6', 'admin权限', '1', null);
INSERT INTO `tree_node` VALUES ('7', '玩家权限', '1', null);
