/*
 Navicat Premium Data Transfer

 Source Server         : rdvip07
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : e_commerce

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 25/02/2022 18:58:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '购物车id',
  `product_id` int(11) NULL DEFAULT NULL COMMENT '产品id',
  `cart_id` int(11) NULL DEFAULT NULL COMMENT '购物车的id编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES (27, 2, 1);
INSERT INTO `cart` VALUES (30, 6, 1);

-- ----------------------------
-- Table structure for evaluate
-- ----------------------------
DROP TABLE IF EXISTS `evaluate`;
CREATE TABLE `evaluate`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `p_id` int(11) NOT NULL COMMENT '产品id',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '评论的内容',
  `u_id` int(11) NULL DEFAULT NULL COMMENT '评论者id',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of evaluate
-- ----------------------------
INSERT INTO `evaluate` VALUES (1, 1, '性价比：屏幕双喇叭888芯片都属于]顶配的标准了，小米的性价比很高运行速度：五纳米高通888无可挑剔外观设计：戴上送的壳子后还是很薄，精致的外观年轻时尚。我选择小米11，不为别的，厚德载物，国产手机一直在努力走向高端，这是趋势也是现实，当我们再毫无顾忌乱喷的时候，想想国产手机的发展史，想想小米做手机前国内市场满大街的韩国**货，多给自己国家的企业一些包容和理解吧，拿到这台手机时我的感觉是精致和时尚，为小米点赞，也为国产手机行业今天的成就点赞! ! !', 1, '2021-06-03 16:32:03');
INSERT INTO `evaluate` VALUES (2, 7, '外形外观:外观终于回归到乔老经典之作,抛去\n花里胡哨的外观,还是简洁、方正经典耐看。非\n常喜欢。\n屏幕音效:显示效果非常棒,完全满足日常使用\n需求。\n拍照效果:纯爷们一个,直男很少拍照。\n运行速度:A14处理器速度真快,加上5G简直起\n飞。\n待机时间:用了俩天,亲身体验,一天一充,还\n可以,没网上说的那样一天三充。\n很幸运第一时间体验经典之作。感谢久汇通旗舰\n店送的那么多礼品,非常nice', 1, '2021-06-10 22:01:22');
INSERT INTO `evaluate` VALUES (3, 10, '已经数不清第几次为三星的信仰而充值,S21+新\n机一发布就赶紧预定了,从s7开始就离不开S系\n列了。因为自己本身是一名短视频创作者,所以\n对手机的拍照性能比较看重,8K视频快照、Ai一\n键多拍、超级稳定模式、长焦、广角、超广角这\n些功能都非常友好,而且还有30倍超视觉空间变\n焦,再加上6400万像素的主摄,拍视频确实很给\n力。当然,性能方面也不能差,最新的骁龙888\n和120Hz护目屏,滑动时丝毫没有卡顿感,玩游\n戏也是很流畅,用了几天完全不会感到后悔,如\n果要帮别人推荐手机,我一定会选择这款。', 2, '2021-06-10 22:17:01');
INSERT INTO `evaluate` VALUES (4, 2, '外形外观:外观终于回归到乔老经典之作,抛去\n花里胡哨的外观,还是简洁、方正经典耐看。非\n常喜欢。\n屏幕音效:显示效果非常棒,完全满足日常使用\n需求。\n拍照效果:纯爷们一个,直男很少拍照。\n运行速度:A14处理器速度真快,加上5G简直起\n飞。\n待机时间:用了俩天,亲身体验,一天一充,还\n可以,没网上说的那样一天三充。\n很幸运第一时间体验经典之作。感谢久汇通旗舰\n店送的那么多礼品,非常nice', 2, '2021-06-10 23:17:17');
INSERT INTO `evaluate` VALUES (5, 3, '外形外观:外形帅气,保时捷设计,非常商务稳\n重!\n屏幕音效:屏幕不错,高刷,音效很好!\n拍照效果:拍照那简直了,不用说了,很棒\n运行速度:8+256也够用了,主要是12+买不到\n原价的,郁闷!', 1, '2021-06-09 22:18:17');
INSERT INTO `evaluate` VALUES (6, 4, '手机的外\n观很好看,时尚大方,后面的大logo也挺惊艳,\n很是漂亮,屏幕的音质也挺好,也没有什么杂\n音,特别是指纹解锁这一块做的非常好,很是实\n用,拍照效果很好,运行的速度也挺快,待机时\n间在玩游戏的情况下,基本上半天嗯,也足够\n了,充电速度非常快,基本上半小时就可以充满\n了,曲面屏做的也是我很喜欢的。这款手机无论\n是颜值还是流畅度都超出我的想象,屏幕显示效\n果非常棒,刷新率特别流畅,配得上顶级旗舰,', 2, '2021-06-09 19:19:55');
INSERT INTO `evaluate` VALUES (7, 5, '五号下的单七号早上收到货,物流速度很快,用\n了两天总体感觉上个手机用的igoo pro 所以上手\n很快,现在的旗舰机基本都很快了,性能能满足\n大部分人的需求,最直观的感受就是120HZ刷新\n率太太太耗电了,作为重度手机用户充满电勉强\n坚持半天,高功耗这可能是高性能的短板,好在\n这个大个头的充电器真真真的快,十五分钟充满\n一点不含水分,实测百分之五到充满十四分多,\n所以耗电也不是什么大问题。就是充电器个头真\n不小随身携带不太方便。物流快,手机快,下单\n也得速度要快动作要帅!', 1, '2021-06-08 22:21:11');
INSERT INTO `evaluate` VALUES (8, 6, '手机非常棒，孩子很喜欢', 1, '2021-06-10 15:22:29');
INSERT INTO `evaluate` VALUES (9, 8, '外形外观:拿在手上很舒服,单手刚好掌控,\n直喜欢用直屏,1+9绝对是满血直屏旗舰手机,\n在雾面玻璃的基础上叠加亮面玻璃,黑色的漫反\n射AG膜片有着不沾染指纹的特性,很赞!它的设\n计好看,手感轻薄,配置齐全的基础上着力发力\n的影像,某种程度上接近了完美。\n屏幕音效:屏幕加入了自动色温调节,原彩显\n示,加上120HZ的刷屏率,清晰流畅,上下两个\n扬声器,播放时堪比音箱。手机有杜比音效,音\n质悦耳动听。', 2, '2021-06-09 22:23:23');
INSERT INTO `evaluate` VALUES (10, 1, '外形外观:时尚大方精美\n拍照效果:拍照最优1亿像素。自己想象一下。得\n多清晰。\n运行速度:运行速度流畅。游戏不带卡顿的。\n待机时间:待机时间一百也就一天。毕竟强大的\n配置。高端大气的屏幕。耗电是肯定的', 2, '2021-06-08 22:27:02');
INSERT INTO `evaluate` VALUES (11, 2, '外形外观:比iPhone 11更轻更薄更小巧\n屏幕音效:屏幕别提多爽了,简直不要太爽,和\n12Pro同样分辨率,太舒服了。扬声器外放音质也\n特别好,音量也很大,立体声效果明显\n拍照效果:广角和超广角都支持夜景模式了,夜\n晚拍照更清晰了,HDR3拍照效果非常好,杜比\n视频拍摄效果非常好\n运行速度:A14单核秒杀骁龙865+,多核更是无\n人能敌,感觉连未出的888都无法媲美的。\n待机时间:真的很好,没有网上说的那么差,中\n度使用一天了,都是还有电的。\n其他特色:IOS系统一生吹!iOS真的牛', 1, '2021-06-09 22:29:28');
INSERT INTO `evaluate` VALUES (13, 1, '小米10S心仪很久了，终于下定决心购买了，性能强悍高通骁龙870处理器不是盖的，不过更新系统时候很烫不知道玩游戏会不会，因为游戏没有安装，续航还好，拍照效果很不错，值得购买值得推荐。我选择小米11，不为别的，厚德载物，国产手机一直在努力走向高端，这是趋势也是现实，当我们再毫无顾忌乱喷的时候，想想国产手机的发展史，想想小米做手机前国内市场满大街的韩国**货，多给自己国家的企业一些包容和理解吧，拿到这台手机时我的感觉是精致和时尚，为小米点赞', 3, '2021-06-10 22:43:41');
INSERT INTO `evaluate` VALUES (14, 1, '买的手机收到了，用了几天来好评，确实漂亮好看，而且价格实惠，不卡机网速快！用着流畅！满意满意网购！我选择小米11，不为别的，厚德载物，国产手机一直在努力走向高端，这是趋势也是现实，当我们再毫无顾忌乱喷的时候，想想国产手机的发展史，想想小米做手机前国内市场满大街的韩国**货，多给自己国家的企业一些包容和理解吧，拿到这台手机时我的感觉是精致和时尚，为小米点赞，多给自己国家的企业一些包容和理解吧', 1, '2021-06-05 22:44:00');
INSERT INTO `evaluate` VALUES (15, 9, '很期待的手机,到手后就迫不及待打开了,第一\n眼感觉很瘦长,边缘不搁手,背面火山摄像头很\n有质感,背面壳是磨砂材质的,不容易留下指\n纹,白色很好看,拿在手里不觉得大,刚刚好,\n运行速度很快,还没有深度测试,平时不怎么玩\n游戏,手机基本功能已经够了,喜欢得赶紧下手\n吧。', 1, '2021-06-10 22:47:01');
INSERT INTO `evaluate` VALUES (16, 2, '暂时没有出现翻车情况，手感极佳。续航能力马马虎虎。就是物流挺慢的，原来顺丰没有想象的那么快，88vip没有感觉像是损失一个亿。88会员比我还少花500。只能说这款手机含金量还是有的。芜湖起飞。', 2, '2021-06-03 22:48:37');
INSERT INTO `evaluate` VALUES (17, 2, '大品牌，用起来很放心，质量非常好，赶上活动购买非常的划算待机时间:无论哪款手机,玩起游戏都会发烫,\n一加在可接受的范畴内,如果不玩游戏,正常使\n用,一白天是没问题的,充电确实快,和商品描\n述一致。', 2, '2021-06-04 22:48:40');
INSERT INTO `evaluate` VALUES (18, 3, '拍照效果：拍照效果不错，很清晰。 电池续航：经常玩手机的 基本能保证一天，除非一直游戏估计能续航8个小时左右吧，很不错了。 通信音质：音质还可以吧。 显示效果：曲屏 感觉不错，很有质感，高大上 一直都是华为控，支持祖国 支持国货 华为加油。 另外就是送的东西看上去也还不错 就是还没机会用用。很多辅助小功能昨天摆弄了一个晚上才摸出点门道。 电池续航：不错，昨天晚上20%到充满电，今天一天都有电，快充很给力。', 1, '2021-06-09 22:55:09');
INSERT INTO `evaluate` VALUES (19, 3, '其他特色：功能强大，很多自带的app，从社交到娱乐应有尽有。 拍照效果：还可以，像素很清晰，自动聚焦还提示如何p图呈现最佳效果，简直是我这种拍照小白的福音 哈哈…很多辅助小功能昨天摆弄了一个晚上才摸出点门道。 电池续航：不错，昨天晚上20%到充满电，今天一天都有电，快充很给力。 通信音质：很清晰，视频自动美颜，不管是扬声器还是话筒音质都清晰，音量也大。 运行速度：网速给力的情况下基本是运行一个新appm速度是一秒钟，超级丝滑', 1, '2021-06-05 22:55:22');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `pro_id` int(11) NOT NULL COMMENT '产品id',
  `order_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '订单编号',
  `time` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (16, 1, 1, '162306191629410.7867130627206917', '2021-06-07 10:31:56');
INSERT INTO `order` VALUES (17, 1, 4, '162333256288140.9779850066780503', '2021-06-10 13:42:43');
INSERT INTO `order` VALUES (19, 1, 2, '163644492806920.2701976755692249', '2021-11-09 08:02:08');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `pro_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品id',
  `pro_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '产品名称',
  `price` decimal(65, 2) NOT NULL COMMENT '产品价格',
  `details` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '产品细节',
  `color` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '产品颜色',
  `quantity` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '产品数量',
  `kind` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '产品分类',
  `brand` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '产品品牌',
  `image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '产品图像地址',
  PRIMARY KEY (`pro_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, '小米10', 2999.00, '【支持88VIP消费券 享24期免息】小米10S 5g手机骁龙870对称式立体声智能拍照游戏小米官方旗舰店小米手机', '白色', '999', '手机', '小米', '1.jpg');
INSERT INTO `product` VALUES (2, '苹果12', 9428.00, '24期花呗免息付款0首付 Apple/苹果 iPhone 12 Pro Max 5G手机苹果12promax正品官方旗舰11promax官网5g12pro', '黑色', '878', '手机', '苹果', '2.jpg');
INSERT INTO `product` VALUES (3, '华为nova', 3999.00, '24期免息花呗分期付款0首付 Huawei/华为nova 8 5g手机麒麟芯片66W超级快充曲面屏官方正品旗舰店华为nova8', '亮黑色', '125', '手机', '华为', '3.jpg');
INSERT INTO `product` VALUES (4, '荣耀30S', 2699.00, '新品【3期免息】HONOR荣耀30S 全网通5G手机官网正品P40系列V30直降X10降价华为nova7新款mate官方旗舰店同款', '青色', '555', '手机', '荣耀', '4.jpg');
INSERT INTO `product` VALUES (5, 'IQOO U3', 1398.00, '至高省160【3期免息】vivo iQOO U3 5g手机vivo官方旗舰店正品爱酷vivoiqoou3 iqoou3 iq00u3 ipoou3 iqoou3x', '太初蓝', '452', '手机', 'vivo', '5.jpg');
INSERT INTO `product` VALUES (6, 'IQOO U3X', 1499.00, '【今日特惠200 整点赠耳机】vivo iQOO U3x新品高通芯千元5G大电池学生老人拍照智能手机vivoiqooU3x vivou3x', '幻蓝', '356', '手机', 'vivo', '6.jpg');
INSERT INTO `product` VALUES (7, '苹果12', 5969.00, 'Apple 苹果12 iPhone 12 5G全网通 （现货速发 12期免息可选）下单尊享豪礼 绿色 全网通 5G版 128G', '白色', '455', '手机', '苹果', '7.jpg');
INSERT INTO `product` VALUES (8, '一加', 3589.00, '一加 OnePlus 9 5G旗舰120Hz 柔性屏8GB+128GB 紫翼 骁龙888 65W快充 哈苏专业模式 超广角拍照游戏手机', '黑色', '676', '手机', '一加', '8.jpg');
INSERT INTO `product` VALUES (9, 'oppo', 4499.00, 'OPPO Find X3 5000万双主摄IMX766 10亿色臻彩屏 60倍显微镜 骁龙870  8+128镜黑 5G年度旗舰手机', '黑色', '899', '手机', 'oppo', '9.jpg');
INSERT INTO `product` VALUES (10, '三星', 3899.00, '三星 SAMSUNG Galaxy S21 5G（SM-G9910）5G手机 骁龙888 超高清摄像 120Hz护目屏 游戏手机 8G+128G 墨影灰', '灰色', '433', '手机', '三星', '10.jpg');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '登录账号',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '登录密码',
  `identity` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '身份：0为顾客 1为管理员',
  `cart_id` int(255) NOT NULL COMMENT '购物车的id',
  `order_id` int(255) NOT NULL COMMENT '订单的id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '3061c46f9f21df1223da36db8568ee63', '0', 1, 1);
INSERT INTO `user` VALUES (2, 'root', '3061c46f9f21df1223da36db8568ee63', '1', 2, 2);
INSERT INTO `user` VALUES (24, 'aaa', '56542fa514df6bd2fa926b0d5c5692b6', '0', 3, 3);
INSERT INTO `user` VALUES (25, 'kami', '56542fa514df6bd2fa926b0d5c5692b6', '0', 4, 4);

SET FOREIGN_KEY_CHECKS = 1;
