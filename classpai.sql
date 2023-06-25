/*
 Navicat Premium Data Transfer

 Source Server         : mysql.root
 Source Server Type    : MySQL
 Source Server Version : 80033 (8.0.33)
 Source Host           : localhost:3306
 Source Schema         : classpai

 Target Server Type    : MySQL
 Target Server Version : 80033 (8.0.33)
 File Encoding         : 65001

 Date: 23/06/2023 14:11:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `cId` int NOT NULL AUTO_INCREMENT,
  `cName` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '课程名称',
  `className` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '班级名称',
  `schoolYear` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '课程时段',
  `semester` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '课程学期',
  `addCourseCode` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL comment '加入课程的课程码',
  `backgroundImage` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '课程背景图片',
  PRIMARY KEY (`cId`, `addCourseCode`) USING BTREE,
  INDEX `cId`(`cId` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, '程序设计基础(C语言)', '软工四班', '2022-2023', '第二学期', '1254336', 'http://localhost:8081/bgImg/01.png');
INSERT INTO `course` VALUES (2, '高级Java', '软工三四班', '2022-2023', '第一学期', '1562555', 'http://localhost:8081/bgImg/02.png');
INSERT INTO `course` VALUES (3, 'UML设计', '软工三四班', '2022-2023', '第二学期', '2566388', 'http://localhost:8081/bgImg/03.png');
INSERT INTO `course` VALUES (4, '软件测试', '软工四班', '2022-2023', '第一学期', '5826656', 'http://localhost:8081/bgImg/05.png');
INSERT INTO `course` VALUES (5, '大学体育', '软工四班', '2022-2023', '第一学期', '8625556', 'http://localhost:8081/bgImg/06.png');
INSERT INTO `course` VALUES (6, '大学英语', '软工四班', '2022-2023', '第二学期', '3655599', 'http://localhost:8081/bgImg/12.png');
INSERT INTO `course` VALUES (8, '高等数学', '软工三四班', '2022-2023', '第一学期', '1c9e4fe', 'http://localhost:8081/bgImg/11.png');
INSERT INTO `course` VALUES (9, '线性代数', '软工四班', '2022-2023', '第一学期', 'ca3e5c9', 'http://localhost:8081/bgImg/09.png');
INSERT INTO `course` VALUES (12, '大学物理', '软工四班', '2022-2023', '第一学期', '6b2896b', 'http://localhost:8081/bgImg/10.png');
INSERT INTO `course` VALUES (17, '物理实验', '软工一二三四班', '2021-2022', '第一学期', 'a6799c2', 'http://localhost:8081/bgImg/01.png');
INSERT INTO `course` VALUES (22, '离散数学', '软工四班', '2022-2023', '第一学期', 'd0a6754', 'http://localhost:8081/bgImg/01.png');
INSERT INTO `course` VALUES (23, 'python程序设计和数据分析', '软工四班', '2022-2023', '第二学期', '12a18e6', 'http://localhost:8081/bgImg/01.png');

-- ----------------------------
-- Table structure for homework
-- ----------------------------
DROP TABLE IF EXISTS `homework`;
CREATE TABLE `homework`  (
  `cId` int NOT NULL,
  `hId` int NOT NULL AUTO_INCREMENT,
  `homeworkType` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '作业类型',
  `hTitle` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '作业标题',
  `hContent` longblob NULL comment '作业内容',
  `releaseTime` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '发布时间',
  `deadline` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '截止时间',
  `fullScore` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '总分',
  PRIMARY KEY (`hId`, `cId`) USING BTREE,
  INDEX `hhcid`(`cId` ASC) USING BTREE,
  INDEX `hId`(`hId` ASC) USING BTREE,
  CONSTRAINT `hhcid` FOREIGN KEY (`cId`) REFERENCES `course` (`cId`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of homework
-- ----------------------------
INSERT INTO `homework` VALUES (2, 1, '个人作业', '测试题1', '参与测试答题', '2023-06-16 22:35', '2023-12-10 22:31', '100');
INSERT INTO `homework` VALUES (2, 3, '个人作业', '测试题2', '参与测试答题', '2023-06-16 22:35', '2023-12-29 00:00', '100');
INSERT INTO `homework` VALUES (2, 4, '个人作业', '实验1','参与实验', '2023-06-16 16:44', '2023-12-31 00:00', '100');
INSERT INTO `homework` VALUES (2, 5, '个人作业', '实验2', '参与实验', '2023-06-16 16:49', '2023-12-31 00:00', '50');
INSERT INTO `homework` VALUES (2, 6, '个人作业', '课程设计1', '请按时提交', '2023-06-16 16:54', '2023-12-30 00:00', '100');
INSERT INTO `homework` VALUES (2, 7, '个人作业', '课程设计2', '请按时提交', '2023-06-16 11:23', '2023-12-24 00:00', '100');
INSERT INTO `homework` VALUES (2, 8, '个人作业', '测试题', '请按时提交', '2023-6-23 21:03', '2023-12-16 00:00', '100');
INSERT INTO `homework` VALUES (22, 9, '个人作业', '实验', '请按时提交', '2023-6-22 17:02', '2023-03-12 00:00', '100');
INSERT INTO `homework` VALUES (23, 10, '个人作业', '学习第一章', '提交文档', '2023-06-13 15:49', '2023-06-20 00:00', '10');
INSERT INTO `homework` VALUES (23, 11, '个人作业', '学习第二章', '提交文档', '2023-06-13 15:50', '2023-06-27 00:00', '100');
INSERT INTO `homework` VALUES (23, 12, '个人作业', '测试题1', '参与测试答题', '2023-06-16 11:15', '2023-06-24 00:00', '50');
INSERT INTO `homework` VALUES (23, 13, '个人作业', '测试题2', '参与测试答题', '2023-06-16 14:35', '2023-06-24 00:00', '100');
INSERT INTO `homework` VALUES (23, 14, '个人作业', 'python环境配置', '请按时完成', '2023-06-16 19:18', '2024-06-18 00:00', '100');
INSERT INTO `homework` VALUES (23, 15, '个人作业', 'jupyter安装', '请按时完成', '2023-06-20 11:18', '2023-06-23 00:00', '100');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `mailboxOrTel` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL comment '邮箱号/账号',
  `password` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '密码',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '姓名',
  `stuNumber` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '学号',
  `classPaiNum` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL comment '课堂派编号',
  `role` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '角色',
  `school` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '学校',
  `department` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '院系',
  `major` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '主修',
  `coursesTaught` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '已教课程',
  `headPortrait` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '头像',
  PRIMARY KEY (`mailboxOrTel`) USING BTREE,
  INDEX `classPaiNum`(`classPaiNum` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('110', '$10$ENM1PpeyLkEU4AWZRsNBeOmJkZPedjpMG5IJamlGZtvQYXxk9UwBS', '赵老师', '', 'ktp3df5424b', '老师', 'cqut', NULL, NULL, NULL, 'http://localhost:8081/月儿.jpg');
INSERT INTO `user` VALUES ('11111', '$2a$10$ENM1PpeyLkEU4AWZRsNBeOmJkZPedjpMG5IJamlGZtvQYXxk9UwBS', '张老师', '', 'ktpec4192cf', '老师', 'cqut', NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES ('12345', '$2a$10$fKUodoCFgz02U1NkakbyDuNH0s0pxfzfU4l3OJRoHjMTKsp9XO.6G', '刘老师', '', 'ktpb483b5a7', '老师', 'cqut', NULL, NULL, NULL, 'http://localhost:8081/月儿.jpg');
INSERT INTO `user` VALUES ('123456', '$2a$10$ENM1PpeyLkEU4AWZRsNBeOmJkZPedjpMG5IJamlGZtvQYXxk9UwBS', '赵老师', '', 'ktp04e51639', '老师', 'cqut', NULL, NULL, NULL, 'http://localhost:8081/月儿.jpg');
INSERT INTO `user` VALUES ('12345678', '$2a$10$ENM1PpeyLkEU4AWZRsNBeOmJkZPedjpMG5IJamlGZtvQYXxk9UwBS', '布老师', '', 'ktp4d28a8e4', '老师', 'cqut', NULL, NULL, NULL, 'http://localhost:8081/月儿.jpg');
INSERT INTO `user` VALUES ('123456789', '$2a$10$ENM1PpeyLkEU4AWZRsNBeOmJkZPedjpMG5IJamlGZtvQYXxk9UwBS', '李老师', '', 'ktp14619ecc', '老师', 'cqut', NULL, NULL, NULL, 'http://localhost:8081/月儿.jpg');
INSERT INTO `user` VALUES ('1234567890', '$2a$10$BHGcHrCiiKFWgcxbCcHzIem6k9NYiGP1MFv1ApxZvhM6uuT5TzoHi', '王坤', '1', 'ktp4cfafa49', '学生', 'cqut', NULL, NULL, NULL, 'http://localhost:8081/月儿.jpg');
INSERT INTO `user` VALUES ('125488', '$2a$10$PJTbo0Yq6F9Mb6i0iqhIYucgKfseCT9nq418IT7kYbYaXEJnFDzva', '张老师', '', 'ktp1425', '老师', 'cqut', NULL, NULL, NULL, 'http://localhost:8081/月儿.jpg');
INSERT INTO `user` VALUES ('13528476902', '$2a$10$BHGcHrCiiKFWgcxbCcHzIem6k9NYiGP1MFv1ApxZvhM6uuT5TzoHi', '吴林优', '2', 'ktpa06eabf3', '学生', '重庆理工大学', NULL, NULL, NULL, 'http://localhost:8081/月儿.jpg');
INSERT INTO `user` VALUES ('admin', '$2a$10$ENM1PpeyLkEU4AWZRsNBeOmJkZPedjpMG5IJamlGZtvQYXxk9UwBS', '刘老师', NULL, 'ktp001', '老师', '重庆理工大学', NULL, NULL, NULL, 'http://localhost:8081/月儿.jpg');
INSERT INTO `user` VALUES ('88888888', '$2a$10$BHGcHrCiiKFWgcxbCcHzIem6k9NYiGP1MFv1ApxZvhM6uuT5TzoHi', '朱果蔚', '3', 'ktpa06eabf3', '学生', '重庆理工大学', NULL, NULL, NULL, 'http://localhost:8081/月儿.jpg');

-- ----------------------------
-- Table structure for usercourse
-- ----------------------------
DROP TABLE IF EXISTS `usercourse`;
CREATE TABLE `usercourse`  (
  `classPaiNum` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL comment '课堂派编号',
  `cId` int NOT NULL,
  `role` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '角色',
  `isTopping` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '是否置顶',
  `serialNumber` int NULL DEFAULT NULL comment '编号',
  `isPlaceOnFile` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL ,
  PRIMARY KEY (`classPaiNum`, `cId`) USING BTREE,
  INDEX `cid`(`cId` ASC) USING BTREE,
  CONSTRAINT `cid` FOREIGN KEY (`cId`) REFERENCES `course` (`cId`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `classPaiNum` FOREIGN KEY (`classPaiNum`) REFERENCES `user` (`classPaiNum`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of usercourse
-- ----------------------------
INSERT INTO `usercourse` VALUES ('ktp001', 1, '学生', '0', 4, '0');
INSERT INTO `usercourse` VALUES ('ktp001', 2, '老师', '1', 0, '0');
INSERT INTO `usercourse` VALUES ('ktp001', 4, '学生', '0', 7, '0');
INSERT INTO `usercourse` VALUES ('ktp001', 6, '学生', '0', 5, '0');
INSERT INTO `usercourse` VALUES ('ktp001', 8, '老师', '0', 1, '0');
INSERT INTO `usercourse` VALUES ('ktp001', 9, '老师', '0', 2, '0');
INSERT INTO `usercourse` VALUES ('ktp001', 12, '老师', '0', 6, '0');
INSERT INTO `usercourse` VALUES ('ktp001', 17, '老师', NULL, 3, NULL);
INSERT INTO `usercourse` VALUES ('ktp001', 21, '老师', NULL, NULL, NULL);
INSERT INTO `usercourse` VALUES ('ktp001', 22, '学生', NULL, NULL, NULL);
INSERT INTO `usercourse` VALUES ('ktp04e51639', 22, '老师', NULL, NULL, NULL);
INSERT INTO `usercourse` VALUES ('ktp1425', 1, '老师', '0', NULL, '0');
INSERT INTO `usercourse` VALUES ('ktp1425', 2, '学生', NULL, NULL, '0');
INSERT INTO `usercourse` VALUES ('ktp1425', 3, '老师', NULL, NULL, NULL);
INSERT INTO `usercourse` VALUES ('ktp1425', 4, '老师', '0', NULL, '0');
INSERT INTO `usercourse` VALUES ('ktp1425', 5, '老师', '0', NULL, '0');
INSERT INTO `usercourse` VALUES ('ktp1425', 6, '老师', '0', NULL, '0');
INSERT INTO `usercourse` VALUES ('ktp4cfafa49', 1, '学生', '0', 0, NULL);
INSERT INTO `usercourse` VALUES ('ktp4cfafa49', 2, '学生', '0', 1, NULL);
INSERT INTO `usercourse` VALUES ('ktp4cfafa49', 8, '学生', NULL, 2, NULL);
INSERT INTO `usercourse` VALUES ('ktp4cfafa49', 23, '学生', '0', 3, NULL);
INSERT INTO `usercourse` VALUES ('ktp4d28a8e4', 23, '老师', '0', 0, NULL);
INSERT INTO `usercourse` VALUES ('ktpa06eabf3', 1, '学生', '0', 0, '1');
INSERT INTO `usercourse` VALUES ('ktpa06eabf3', 2, '学生', '1', 0, '0');
INSERT INTO `usercourse` VALUES ('ktpb483b5a7', 1, '学生', NULL, NULL, NULL);
INSERT INTO `usercourse` VALUES ('ktpb483b5a7', 2, '学生', NULL, NULL, NULL);
INSERT INTO `usercourse` VALUES ('ktpec4192cf', 15, '老师', '0', 0, '0');
INSERT INTO `usercourse` VALUES ('ktpec4192cf', 16, '老师', NULL, 1, NULL);

-- ----------------------------
-- Table structure for usercoursehomework
-- ----------------------------
DROP TABLE IF EXISTS `usercoursehomework`;
CREATE TABLE `usercoursehomework`  (
  `hId` int NOT NULL,
  `cId` int NOT NULL,
  `classPaiNum` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL comment '课堂派编号',
  `submitContent` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '提交内容',
  `leavingMessage` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '作业留言',
  `isAlreadySubmit` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '是否已经提交',
  `isAlreadyCorrecting` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '是否已经完成',
  `achievement` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '分数',
  `isHideAchievement` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '是否隐藏分数',
  `teacherComments` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL comment '老师评价',
  `reviewTimes` int NULL DEFAULT NULL ,
  `repulseTime` int NULL DEFAULT NULL comment '打回作业时间',
  `expeditingTimes` int NULL DEFAULT NULL ,
  PRIMARY KEY (`hId`, `cId`, `classPaiNum`) USING BTREE,
  INDEX `HcId`(`cId` ASC) USING BTREE,
  INDEX `HclassPaiNum`(`classPaiNum` ASC) USING BTREE,
  CONSTRAINT `HcId` FOREIGN KEY (`cId`) REFERENCES `course` (`cId`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `HclassPaiNum` FOREIGN KEY (`classPaiNum`) REFERENCES `user` (`classPaiNum`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `hId` FOREIGN KEY (`hId`) REFERENCES `homework` (`hId`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of usercoursehomework
-- ----------------------------
INSERT INTO `usercoursehomework` VALUES (1, 2, 'ktp1425', 'http://localhost:8081/homework/054bdb2_实验六(2)：BOM与DOM编程实验.pdf,http://localhost:8081/homework/0331ef3_！思想政治理论课实践作业（模版）(3).docx', NULL, '1', '1', '99', NULL, '1', NULL, NULL, NULL);
INSERT INTO `usercoursehomework` VALUES (1, 2, 'ktp4cfafa49', 'null,http://localhost:8081/homework/41b0d6f_Test01.java', NULL, '1', '1', '33', NULL, '2', NULL, NULL, NULL);
INSERT INTO `usercoursehomework` VALUES (1, 2, 'ktpa06eabf3', 'http://localhost:8081/homework/978c862_a.jpg,http://localhost:8081/homework/8494abd_a.jpg,http://localhost:8081/homework/ae958b6_form.png', NULL, '1', '1', '89', NULL, '8', NULL, NULL, NULL);
INSERT INTO `usercoursehomework` VALUES (1, 2, 'ktpb483b5a7', 'null,http://localhost:8081/homework/fe758bc_11.png', NULL, '1', '1', '66', NULL, '1', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
