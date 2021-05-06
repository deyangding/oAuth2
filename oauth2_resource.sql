/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : oauth2_resource

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2021-05-06 15:54:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_emp
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp` (
  `id` varchar(256) NOT NULL,
  `emp_name` varchar(50) NOT NULL COMMENT '员工姓名',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `emp_no` varchar(20) DEFAULT NULL COMMENT '员工号',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `birthday` date NOT NULL COMMENT '生日',
  `entry_time` datetime NOT NULL COMMENT '入职时间',
  `leave_time` datetime DEFAULT NULL COMMENT '离职时间',
  `is_deleted` tinyint(4) DEFAULT '0' COMMENT '0表示有效;1表示删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工表';

-- ----------------------------
-- Records of t_emp
-- ----------------------------
