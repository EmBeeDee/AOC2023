package net.snowtiger.aoc

/**
 * @author mark
 */

object AOC24
{
	val input = "251454256616722, 382438634889004, 18645302082228 @ 43, -207, 371\n289124150762025, 364325878532733, 278169080781801 @ -73, -158, -13\n268852221227649, 10710819924145, 258969710792682 @ 41, 192, 62\n351763034172450, 322198426048034, 561922567658786 @ -121, -112, -414\n276728722511588, 372214386678998, 381433492854136 @ -76, -164, -261\n86239238952939, 52315409183639, 33963786645704 @ 293, 344, 408\n256624948006054, 263165545982134, 296356138484664 @ 19, -16, -17\n214574866118939, 332103049064050, 159015952606540 @ -19, 105, 372\n261488998993895, 250980512994086, 377203461735181 @ -27, 77, -221\n53182352347022, 228738192820152, 158338425002107 @ 270, -53, 169\n272309227594612, 301764417526720, 273586996818978 @ -170, 111, -88\n146329153832504, 328532113037184, 162540148311914 @ 171, -161, 162\n193805495539936, 376879990063108, 224622845879874 @ 23, 22, 20\n279693697643468, 290794132042898, 134633175906004 @ -72, 5, 280\n368459916736732, 417307789321456, 498855737037786 @ -122, -254, -282\n302149653238407, 182712038644595, 261702518130535 @ 15, -14, 63\n229406797147504, 382972986248794, 234160405293569 @ -164, -99, -11\n350327320828184, 103477069116367, 223293733144973 @ -84, 156, 99\n273397758859804, 375016986294544, 215337858956634 @ -54, -175, 109\n250543839414224, 332589064292164, 237968762831434 @ -67, -24, 42\n209435081575334, 341907119720530, 365055079431814 @ 71, -90, -240\n405618300116508, 301705622104622, 298883511965178 @ -120, -119, 14\n206507207713179, 196271147803401, 293748660427187 @ 111, -28, 31\n176460233240464, 48231860394864, 355977638108114 @ 145, 395, -140\n200107836742104, 306956763330976, 273526648158590 @ 111, -105, 31\n248505848026462, 396426091337551, 267024946427715 @ 50, -226, 43\n281193086838816, 26140405538947, 191659441452675 @ 20, 204, 137\n400606565534674, 155094012651116, 189702390341063 @ -134, 71, 141\n79409785597564, 121578201195988, 67615709214238 @ 376, 429, 456\n216976388509981, 344990685886309, 220501527082194 @ -115, 188, 70\n203090854794464, 387002479215489, 217959088263104 @ -100, -40, 76\n195050608530202, 378479965909089, 219866152060881 @ -50, 128, 41\n234673760506567, 294837436276129, 265395633224991 @ 13, 18, -7\n295048052842252, 297552026535848, 365840636538642 @ -182, 64, -313\n244664153797904, 356648053666524, 289062984230494 @ -69, -80, -131\n295780502150924, 259956487228016, 358895928351274 @ 21, -91, -35\n328515226779445, 267234764310517, 307545671725197 @ -151, 32, -71\n269906151728194, 265911820218598, 229453915000128 @ 21, -56, 91\n201881294413244, 395841642891984, 242444451983834 @ -153, -107, -282\n384602217595313, 212975045821178, 177470684679350 @ -103, -11, 154\n313054489317148, 351263198075152, 218062054727898 @ -28, -170, 106\n267623236606625, 286270897992283, 304608735661534 @ -75, 54, -110\n245349851802208, 74210472797692, 189184040013894 @ 49, 214, 145\n455553063630992, 277590808434856, 445388813122698 @ -135, -111, -118\n280423438859964, 256986227903760, 279925642173978 @ -19, -5, 8\n227417806567204, 270545906780309, 195738926936364 @ 64, -26, 140\n405431182223206, 230462580180910, 213091483172388 @ -118, -39, 112\n264465030165062, 259982313916892, 309066893792960 @ -55, 97, -107\n287159794467748, 235444915220116, 304491684035877 @ -16, 7, -19\n172368118790508, 352072841368384, 359498474062474 @ 162, -87, -300\n230181154156924, 237283068112789, 262988213246889 @ 40, 94, 15\n321776960911774, 214717751621974, 300444625220814 @ -77, 52, -20\n306617656856880, 133307785386414, 263039797249640 @ 14, 28, 63\n158461521144619, 269192356275794, 229906019275539 @ 205, 169, 65\n328299187482303, 191864385510388, 323287445511526 @ -21, -9, -6\n269222212094719, 391762259853627, 272693453060126 @ -149, -194, -78\n242755546092924, 168548945116618, 332693037474310 @ 56, 72, -44\n202983381996380, 333005156714736, 57863114803754 @ 80, -49, 520\n232241670751054, 300692202857824, 252035134630484 @ 31, -21, 33\n294303708655948, 407152996632112, 247638542882922 @ -177, -243, 19\n185622095552014, 384176133451633, 235125481872797 @ 106, -84, -39\n251810192840884, 200875171211704, 231585239414514 @ 52, 7, 90\n188356975616550, 71966177356108, 401815931808090 @ 129, 105, -82\n234361682866422, 229280687867618, 287079051124808 @ 38, 89, -24\n195798089107014, 356748276682099, 235743177730524 @ 50, 54, -16\n182082879386474, 395502736912059, 316518699743739 @ 134, -202, -265\n356662800986514, 152609509874549, 345680933897995 @ -34, 8, -17\n288480990806804, 385811890737559, 381658053481889 @ -48, -204, -177\n188661950331274, 387118387006224, 224139991885819 @ 34, 19, -23\n328352551958278, 160304934553994, 316046771352478 @ -41, 58, -12\n365873314085239, 466835907641599, 218456992989744 @ -171, -340, 104\n283529068585078, 303676196789826, 273758591315764 @ -167, 64, -65\n257484546777296, 265587575844248, 421879489911910 @ 63, -103, -89\n195770186607090, 389897110751632, 214618552248096 @ -45, -45, 113\n363011071738772, 295905264336092, 373895876457450 @ -42, -130, -46\n306760767037612, 495428141733112, 232513645076610 @ -98, -406, 77\n225882744426394, 429297430929220, 239653116407721 @ -134, -385, -41\n187874154937894, 439729611244514, 290376412874969 @ 70, -599, -677\n212374561787206, 321082780711972, 230018609771574 @ 75, -71, 80\n377815741390116, 310595182714736, 474444011417746 @ -205, -73, -341\n283873998171894, 263136239284102, 250141755207214 @ -9, -36, 60\n212541133624684, 470609053280740, 222217010753613 @ -104, -745, 53\n224526360842412, 267590713793462, 264748506277784 @ 80, -58, 45\n360668283427129, 302074448634574, 421991059270524 @ -139, -79, -208\n203351145768259, 232930983234439, 194428716741399 @ 73, 260, 169\n288136368053230, 180756309839723, 200929737306607 @ -86, 230, 139\n194679177548476, 291585337873552, 250120921415802 @ 79, 255, -43\n258645332007601, 432496576734611, 272119266683803 @ -35, -298, -17\n321798014137738, 531657921238943, 138202131008271 @ -122, -470, 251\n521236321002070, 365679445197082, 319686292954986 @ -201, -198, 6\n247008702437853, 199138312489599, 363338598348854 @ 39, 68, -110\n179824092587524, 339418155659848, 185100395732794 @ 151, 336, 370\n262477175779516, 59325077173514, 144878046457213 @ 40, 173, 193\n228551461036466, 322915187330461, 206377044794752 @ 14, -24, 132\n248789575750879, 315684857718070, 279951341562273 @ 11, -71, -11\n204086932387512, 148240087917448, 198289799501802 @ 87, 321, 146\n386222800341206, 277896363480312, 180863866277918 @ -141, -65, 156\n293752403075324, 159647106634864, 276665948588714 @ 18, 21, 45\n203851020538934, 375890947335484, 213302376193258 @ 21, -87, 118\n258233456321052, 430967993818768, 275157196453434 @ -112, -321, -85\n301969053751592, 217025481218623, 292156403811059 @ -12, -6, 15\n359877868519978, 292798049763852, 298580784972914 @ -77, -103, 10\n360600999711484, 303523884544512, 323036683253404 @ -104, -101, -35\n116700203149879, 134390524050489, 320328226329344 @ 211, 76, -12\n276071652058594, 160929596069188, 402770535040202 @ -29, 189, -218\n190595435747044, 365569294547984, 233826291167674 @ -11, 403, -198\n217686737450419, 404467548779749, 206298085060209 @ -71, -234, 159\n330987683774218, 438488149346263, 242338908911866 @ -38, -276, 78\n155376430579618, 265448795705392, 240695624505594 @ 217, 195, 30\n194420710849824, 142189028613399, 327802452955074 @ 84, 824, -346\n275277868046853, 219449734058320, 329851581958537 @ 39, -45, -9\n211758976633234, 239952959771374, 307833806261514 @ 97, -24, -10\n187954222086671, 418401559632815, 384522011323941 @ 125, -260, -181\n244909407462216, 499355720712741, 224497469369168 @ 44, -374, 96\n307840249796219, 183352842255539, 150476015454269 @ -121, 214, 241\n189281869029047, 387009879043629, 184803918511577 @ 9, 58, 603\n240410033538856, 235391571178258, 488176446565284 @ 52, 5, -280\n337984970307460, 489459430206688, 197603888368866 @ -127, -379, 139\n351704855409408, 238840525478965, 478127291549890 @ -76, -30, -218\n227996134131052, 419039792674448, 187715469535354 @ -155, -325, 280\n260252827498138, 126528582755659, 501485465451168 @ 30, 138, -276\n121253998875889, 16535551371043, 258365650036197 @ 251, 504, 27\n137441587777816, 240383940288508, 79937407107222 @ 237, 140, 419\n297913108562404, 116831080255984, 285047300169514 @ 10, 75, 34\n326791001501280, 208172908018268, 379013059508278 @ -33, -8, -81\n150062053463131, 143623499564990, 162390040046659 @ 169, 37, 165\n273577476729180, 314583567928912, 212003703033082 @ -90, -15, 117\n284704896404008, 57064993510496, 300824589437284 @ 34, 107, 25\n336880049299988, 197318437574784, 251404842830522 @ -51, 13, 66\n183343281274152, 372415640173038, 200111613820225 @ 108, 269, 339\n186999697464892, 381335618245936, 312510340092666 @ 118, -159, -212\n239687512644844, 278037464601900, 287053397136632 @ 16, 25, -39\n201934242282575, 103426875436149, 173199444014586 @ 89, 458, 206\n198755017590594, 375203098640450, 251079375962686 @ 21, -38, -132\n341800324673979, 289543691362584, 249792524406464 @ -75, -85, 64\n267439056368863, 481886277803332, 381297733225566 @ -217, -553, -574\n199872939310204, 348084984866934, 129685731785164 @ 40, 61, 556\n217781410503148, 79831425665492, 45730943936442 @ 100, 86, 278\n243375500365051, 282327188084268, 295289952559354 @ 13, 7, -50\n297672449781454, 432346890786090, 224144942992350 @ -89, -290, 92\n204970633013992, 393620981503981, 215773222680290 @ -68, -138, 102\n390656101629304, 184655144944624, 407648627995254 @ -69, -21, -79\n171191148452673, 348373435158385, 193546562543609 @ 153, -144, 145\n226244548057804, 378914142510484, 78010862120854 @ -44, -132, 661\n237717990029512, 257860328017644, 354628923567497 @ 52, -17, -99\n360520731275148, 188375349111320, 237435997135506 @ -78, 22, 83\n199894569503684, 385768109870556, 221809562589498 @ -54, -38, 38\n147445421414752, 302705659704028, 317546041535873 @ 220, 15, -143\n258825280986979, 492454964820424, 195250499216574 @ -69, -469, 162\n297140306076718, 298843311136468, 325364744715306 @ -23, -91, -42\n233113935515732, 319746337519184, 198018499798678 @ -106, 163, 189\n170115588044094, 306120505099909, 333060054051529 @ 162, -12, -159\n311793983774854, 543229596302234, 203376139207564 @ -125, -514, 133\n357233375331004, 219981661877784, 435135785190614 @ -128, 41, -221\n230050991910928, 295843180062955, 303789991146308 @ 52, -48, -44\n247803564555016, 175160643714364, 208884770434194 @ 25, 148, 120\n215754320690554, 358195959731464, 224787396015564 @ -19, -25, 65\n106935241232660, 95196911855758, 135699860537310 @ 300, 444, 284\n255426473898738, 191895866805328, 292545482165624 @ -97, 435, -135\n210096644238774, 503639316561444, 260840645158354 @ -18, -769, -138\n316043526765910, 179904991119676, 288053234320954 @ -11, 9, 30\n369600168800692, 199142493754612, 360558156582602 @ -86, 6, -62\n181540669791004, 383884130128816, 218988815225850 @ 136, 54, 53\n230357202855282, 208405906817178, 262351567898898 @ 62, 61, 38\n194449646461148, 178277502063380, 132156268800004 @ 104, 325, 315\n323832709985320, 193267706471362, 146279923391034 @ -30, 10, 190\n182319936637960, 327454353560662, 414736346837328 @ 134, -38, -403\n353689553830696, 303645690841675, 357386272324902 @ -236, -18, -198\n209823083294608, 275544973797058, 267068087061306 @ 58, 120, -34\n193038530046729, 333099520707514, 171404591837269 @ 41, 357, 469\n306890507874815, 146247888788126, 165250721351392 @ -51, 149, 184\n292762553629388, 185238489184364, 277640947921234 @ 12, 8, 40\n275115739679985, 249430301386771, 258959847547156 @ -21, 24, 36\n302000832131024, 231362619115100, 242269472022222 @ -9, -28, 77\n261424354985100, 248790270390757, 272627422920987 @ 24, -18, 29\n342622170571879, 434485200750409, 260229471235614 @ -77, -276, 50\n187437924043072, 333569103335516, 274809818822472 @ 118, -19, -73\n294993609642929, 334988527051809, 270856702817894 @ -99, -92, -6\n258876460202983, 301492262440633, 172916086389603 @ -65, 32, 219\n280509593259046, 250281363549408, 262632501577686 @ -38, 35, 26\n168153426669912, 91572418821336, 66019756482150 @ 153, 161, 299\n437657205301532, 141871682804390, 202848937991058 @ -120, 26, 122\n240427172078695, 327985978764265, 154299050062452 @ -111, 86, 364\n205811783680554, 269073167051304, 294287136958914 @ 81, 71, -70\n185080484843196, 362513624206480, 222376507579022 @ 104, 147, 42\n299648403293841, 197669246023083, 405955754801567 @ -97, 172, -267\n327080419324255, 169270583502856, 357715504429434 @ -27, 27, -50\n224625554981416, 330421411233994, 247720434808877 @ -20, 33, -9\n306736874503954, 156586236751534, 347999570684664 @ 10, 13, -24\n349318996823851, 347784545233798, 482958190355526 @ -257, -103, -518\n272520925498534, 172382091271264, 334910820495834 @ 39, 11, -18\n283112794810177, 318112102929592, 203994487855215 @ -23, -101, 127\n369397434030694, 365653877278319, 393077484615384 @ -98, -188, -112\n211188051600954, 227700061609283, 93300135172319 @ 86, 62, 315\n304728663031764, 31601711034704, 503313241908434 @ -25, 251, -267\n197627048004754, 356645784287159, 197730191526864 @ -50, 322, 308\n297733616007589, 213707779088474, 266232233954189 @ -11, 5, 45\n324125990417794, 246415207126354, 245947772692414 @ -185, 120, 40\n217572652797061, 452327539370153, 55183260213332 @ 85, -304, 336\n378198417497692, 173508847636370, 317280310857014 @ -56, -11, 10\n230324879561268, 151046203288944, 120627365283426 @ 63, 143, 251\n329987772979409, 138238742250574, 380632891463414 @ -61, 117, -110\n209245308602620, 292752098878032, 164417750448890 @ 97, -79, 181\n300724469209506, 208937580937260, 281851210917124 @ -33, 41, 15\n334417275779824, 167888442336916, 409267291982670 @ -129, 174, -227\n189145921308284, 368538647560304, 252749533153354 @ 78, 41, -179\n54436657965322, 191364782547451, 8118959671824 @ 302, 42, 380\n289699282607577, 203830163161196, 168008631984662 @ -21, 55, 178\n347234124025419, 318507504329943, 355491771504276 @ -69, -130, -64\n285957301634526, 304406575992694, 256525258255437 @ -82, -27, 23\n298320049385917, 351853697715522, 213000759647163 @ -53, -151, 113\n267574951559155, 367055028620056, 325953788073246 @ 9, -181, -54\n216238855386836, 186156257040889, 219980268919771 @ 48, 318, 97\n171173781250307, 314217917366681, 233565370154372 @ 177, 122, 36\n189110943242844, 12472726354880, 292449703474474 @ 116, 800, -95\n239759671061782, 261352721369635, 288821164502709 @ 14, 64, -45\n269733280832908, 551979089902624, 125809687029066 @ -71, -582, 319\n239878150979346, 69156715829626, 318915853523670 @ 62, 189, -22\n227036696367894, 304726276198364, 210507646461564 @ -21, 109, 125\n272443708073884, 549162465548944, 252489416442714 @ -21, -486, 45\n435066989488039, 269351273006079, 256043550571904 @ -221, -46, 52\n154540431296362, 296347588032915, 248926130122067 @ 178, -68, 57\n140088906948787, 122724638811973, 314865003006082 @ 199, 192, -42\n230885892399868, 62512062202216, 76805265913554 @ 52, 346, 345\n207167245254364, 334678488405190, 206045265277584 @ -24, 202, 165\n249110789165284, 265909575787391, 288055363248584 @ 16, 10, -20\n297042183372556, 184120089387360, 285776382616874 @ 22, -19, 40\n130963914222356, 160289160978590, 14034929952894 @ 204, 92, 380\n393898200512106, 131813027934279, 259181457976645 @ -70, 28, 67\n189836563369406, 385530944195598, 232143973191092 @ 29, 14, -113\n324595777486304, 110173487234644, 211122528218454 @ -94, 237, 116\n280135471314940, 264630749885514, 320296063333990 @ -8, -32, -44\n217513513060079, 231762955692384, 262003272838989 @ 33, 259, -25\n374895871078600, 253322875382422, 360314276791122 @ -82, -66, -54\n285376564765084, 188882948417980, 338159525874834 @ -24, 96, -80\n212871426772516, 372021247776658, 222322778710800 @ -36, -56, 69\n161578649571775, 251490352802161, 226556274514731 @ 165, -14, 93\n509678373737554, 486661233370592, 513824308633304 @ -314, -349, -300\n197517466179004, 384084625559344, 258037398830394 @ -39, -8, -363\n377735558912935, 134613373555297, 428618981278203 @ -65, 40, -109\n221492604206748, 345836054427152, 235382190099546 @ -45, 31, 17\n217391935236452, 368228666537028, 317243184111046 @ 18, -116, -227\n246303793250098, 290163171749284, 280536149916876 @ -5, 13, -33\n399920931369004, 309632023943724, 203935387514214 @ -164, -106, 125\n396617641696082, 294320729969006, 231559408119722 @ -70, -131, 94\n220860955602222, 240017162190065, 378973854413850 @ 90, -44, -82\n222287634112540, 153718458183312, 185991967532026 @ 88, 59, 144\n277772879378293, 206237298757076, 343164013376166 @ -17, 79, -94\n192971253402220, 366651322303497, 239858802242649 @ 88, -76, 5\n260114435175534, 288517352615716, 290654974258190 @ -34, 15, -54\n121537062088624, 98973005550646, 209854099951249 @ 196, 69, 115\n210340987434844, 154338640338739, 261654916764354 @ 72, 320, 6\n201232602095308, 379829491332840, 217862890250716 @ -8, -53, 88\n195682544420788, 413782299872920, 232436190673386 @ 62, -283, 18\n232462300185925, 23850716725345, 48716151930897 @ 37, 504, 433\n184763453113479, 382689744241257, 221042144572266 @ 111, -64, 62\n272933543982564, 405712927523770, 414475678432574 @ -244, -240, -720\n253566231571453, 316094990743401, 399136018121470 @ 25, -100, -174\n275003154361276, 216034642549408, 174218537736474 @ -48, 135, 190\n222897866247328, 336578098545220, 223357749397218 @ 29, -60, 88\n264261612440065, 346090628915128, 333089046368997 @ -55, -101, -163\n301837726006129, 227914138084120, 385195032193731 @ 11, -53, -67\n371939331955910, 276997655350690, 358767770657558 @ -163, -36, -116\n396187942408468, 205250192813755, 289384703585289 @ -80, -36, 35\n206426905910224, 330563124587339, 188585595800604 @ 28, 86, 224\n255642251766052, 204374926802776, 433544435202402 @ 54, -15, -132\n193001556132667, 285173047624489, 248889760031992 @ 103, 108, 12\n285536553122505, 205738788029572, 302245899191014 @ 17, -9, 10\n184370937634000, 315130400817661, 83482801547383 @ 124, 144, 667\n248614401020866, 303714512644648, 278818753554042 @ -15, -9, -34\n287399221071724, 391509419528164, 117484506726414 @ -76, -210, 305\n228295263912359, 218295473824063, 312232934556212 @ -9, 342, -192\n182140118397748, 390904362574300, 282966748534401 @ 128, -49, -799\n163602324011762, 247984646414470, 208936595799962 @ 233, 612, 142\n199569993865327, 315741765758399, 219967193987325 @ -65, 758, 53\n176357683537489, 307878609766924, 52817882983224 @ 155, 119, 704\n204315225644509, 424649442516862, 55911973952337 @ 41, -319, 773\n190370280585690, 401780637271080, 194787103332464 @ 125, -233, 135\n171053516585824, 319521106210567, 313433640721806 @ 156, -74, -78\n476784294122694, 536654102169889, 371253725914766 @ -234, -402, -86\n218750079314593, 318297316664422, 266257090038072 @ 39, -11, -24\n197946515735660, 484619779051968, 296083345148362 @ 54, -635, -296\n194043677514652, 349216268815573, 209775053705382 @ 8, 334, 162\n194109224863039, 43017018758176, 281048790639165 @ 121, 195, 31\n261191824266421, 396995536043746, 145659382226439 @ -123, -211, 335\n367596420231124, 216037589744064, 231083562625274 @ -185, 89, 82\n296866417902764, 168759630474824, 282747784562134 @ 12, 17, 37\n220453106025504, 296814832100874, 240925732870229 @ 36, 41, 43\n221913159991344, 149109424689784, 299011140729034 @ 65, 213, -38\n206682317368970, 277162787026740, 203949589595442 @ 53, 185, 146\n140571865541364, 93984743007256, 255823204842754 @ 251, 636, -5\n344043384987267, 406462017639990, 318532603501137 @ -85, -239, -31\n157391196130198, 248948651947576, 246434481534168 @ 162, -69, 76\n262926690786047, 279361976451174, 261282667603709 @ -13, -7, 25\n165561727629944, 286559245286104, 112401183207494 @ 153, -111, 219\n338379439665515, 159657016202264, 282321357466507 @ -43, 43, 33\n264377256665162, 152055261705584, 390645020066518 @ 5, 163, -168\n279172409384999, 332554952875949, 532315024821330 @ -19, -122, -394\n319402351711330, 263034821469280, 329511641002098 @ -167, 75, -142\n245968014205034, 384015060139844, 157918607855134 @ -79, -167, 300"
	val input1 = "19, 13, 30 @ -2,  1, -2\n18, 19, 22 @ -1, -1, -2\n20, 25, 34 @ -2, -2, -4\n12, 31, 28 @ -1, -2, -1\n20, 19, 15 @  1, -5, -3"

	def main(args: Array[String]): Unit =
	{
		//val (in,min,max) = (input1, 7.0, 27.0)
		val (in,min,max) = (input, 200000000000000.0, 400000000000000.0)
		val lines = in.split("\\\n").toList
		val hail = lines.map(parseHail).toList
		val space = Space(hail)//.translate(Point(-min,-min,0))
		space.print()

		val t = System.currentTimeMillis()
		val n = space.countIntersections(min,max)
		println(n)

		println((System.currentTimeMillis()-t)+"ms")
	}

	val scale = 1.0
	def parseHail(line: String): Hail = {
		val s"$px, $py, $pz @ $dx, $dy, $dz" = line
		def n(s: String) = BigDecimal(s.trim)
		Hail(Point(n(px),n(py),n(pz)), Point(n(dx)*scale,n(dy)*scale,n(dz)*scale))
	}

	case class Point(x: BigDecimal, y: BigDecimal, z: BigDecimal) {
		def add(p: Point) = Point(x+p.x, y+p.y, z+p.z)
		def inside(max: Point): Boolean = x>=0 && y>=0 && z>=0 && x<=max.x && y<=max.y && z<=max.z
		def insideXY(min: Point, max: Point): Boolean = x>=min.x && y>=min.y && x<=max.x && y<=max.y

		override def toString: String = s"($x,$y,$z)"
	}

	case class Hail(p: Point, d: Point) {
		val p2 = p.add(d)
		val det = p.x*p2.y - p.y*p2.x
		override def toString: String = p+" -> "+d
		def translate(delta: Point) = Hail(p.add(delta), d)
		def intersectXY(h: Hail): Option[Point] = {
			val denom = d.x*h.d.y - d.y*h.d.x
			if (denom==0) None
			else if ((h.p.x-p.x)*h.d.y*denom.signum < (h.p.y-p.y)*h.d.x*denom.signum) None
			else if ((h.p.x-p.x)*d.y*denom.signum < (h.p.y-p.y)*d.x*denom.signum) None
			else {
				val mx = (h.det*d.x - det*h.d.x)/denom
				val my = (h.det*d.y - det*h.d.y)/denom
				Some(Point(mx,my,0))
			}
		}
		def printIntersectXY(h: Hail) = {
			val i = intersectXY(h)
			println(this+" intersect "+h+" = "+i)
			i
		}

	}

	case class Space(hail: List[Hail]) {
		def print() = {
			hail.foreach(println)
			println(hail.size)
			println()
		}

		def translate(d: Point) = Space(hail.map(_.translate(d)))

		def countIntersections(min: Double, max: Double): Int = {
			val (bMin,bMax) = (Point(min,min,0), Point(max,max,max))
			def int(h1: Hail, h2: Hail) = h1.intersectXY(h2).map(_.insideXY(bMin,bMax)).getOrElse(false)
			var count = 0
			for (a <- 0 until hail.size)
				for (b  <- 0 until hail.size)
					if (b>a && int(hail(a),hail(b))) count+= 1
			count
		}
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}