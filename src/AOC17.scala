package net.snowtiger.aoc

import java.util
import scala.collection.{SortedMap, mutable}

/**
 * @author mark
 */

object AOC17
{
	val input1 = "2413432311323\n3215453535623\n3255245654254\n3446585845452\n4546657867536\n1438598798454\n4457876987766\n3637877979653\n4654967986887\n4564679986453\n1224686865563\n2546548887735\n4322674655533"
	val input0 = "111111111111\n999999999991\n999999999991\n999999999991\n999999999991"
	val input = "112122213334114113231321113242442532114231435134313123422531466634524341365435226414266142534414424454223435252235121122412212321113333331322\n223232213233241232223442321443443213241415425134452545521652444356235262253644142626141551655514435312312325445125353434124143233211232113333\n211213214441123212122221154421231255125552335213135145221152221555311336145563141322415243442545415433321515514324222342443413124234411332123\n131313334321312411414211223544553144245344433412164431622456356541225525241612614244464345425154453425541313132514552342123141432344113233321\n111113112343343311214243333415452215523324216126534451321114612342532211114446546111426124124133263133355511145531124154124223433321232342331\n221213233112134144413533333233441132153566413136335636542312215222534622666142354151643636433123324415532323355522333345421134232212243234332\n213124343224222223453324145323112233253615131241326436323652613243124452252556561345215556214163546142251544341332435552341312311341311242433\n232442112421414214235235535351225513632421241545535454262653122656213436336213253565361263333423411454622122124255111454533244122222332243112\n124342241222442141523553131335425436256264245131616344414622444323334661544566324434213252644342151315522665212353444312155325343224134223143\n113121421144241234221422334223321664536152461265363514423421141627531116552661735133255163221316232553164131254221455144312333342133312324234\n223432424242434452112232342511562316535244164413161633666175562412475177464412157124654545451533231514162162534455455154343315513334234133423\n432443311111134434532153445151333416134532661123445463436425756534173755562221337751133141134233543454326234111642214531541223424344433132324\n141431222332434541355553522346261125611116555544265116475145413757247625144415741445145636351653211116422641315241452541121545255324431444311\n221214341124323143353552332435256554655566364623732257151431113223726747124526431162317573261463562614534211222354625434552515111451123343333\n113413432244251354425335233316443432621432141342641274641241223631514614324372743726752436355566121515553631416333523525413142232351113132214\n121424124215414531434215565214314325121452322537256554252656464173135421422213247416723532755135163213662125156532414411515352451154331213411\n433413221512223555141245335413113266426541712322333573342245651321116443514346475312473232533324224542412312334622423444244251353232154421421\n441313143341555322135314261224536116411571453471626113114325633616554343344734736654674331536223135425161425663665241534441152155145521124321\n313434155451145555521352512231526632411424122612262166342451461543251665133652546121661463626353126646125546655624255256425243514143424322421\n214133533545351442336114462114436664553553364141514631662747162314755263785436712515643167172757461327675265116163544421256513552321411242114\n234244434234433223513151266262315532163634612453471235252112422636575445626464264664755147361144133516633433115414114556666624315155541411144\n213122135421411133636161216542616141216711613272221641337352468367222337365685762673527335551556314275715541124636631345322121334121414543344\n331412322151512132633113554245514442557375223174627721256332578558834826365585227873457541653137751123251632563115663126322312345152333112411\n233322523333314526643621225434327374156742647737367734268382644753476883753563867433834828646557444166256374126352555325143525444113344315423\n313244221314354216454166632416477244532735636662647378334784284287764828563888552657323537267263566441267547777331243113236216214521443154234\n121334252152341432265646423317156713347454314726282383522585764278683342278634528375544883844363673526566144451741246332566525354514211525215\n233123131453511451154635534463531457662465163674385887633546488537863387775773644347363643383233243221455553446214266266365545236544241224454\n135133543152166422162652446136237363271215335475834758565272438874554585838645336675686368367662254561156235442774322532614223541425554354211\n135114443351266246234124332164463452714537353565722645268825223462334684527468773725253385584437388753666167717616367422136534464124221255154\n143211552113431335246161252751442755515356873735466733762642822643376633865835866258383423734766223443517715432172173226565666612135421142512\n522124444145322162436434367444547637513588464788458227765557564677845354889774867886653262846832288773764622443272431516151353613122434523142\n425135524366644246446414436625731112273572384237436586752722855596948968795785539548768822337823375835734764733563747665123222464552252454111\n141553212252525124636317752717416337578526824658568358333334975775535333336455453785766472827663336372238237746663222161666543555452335141524\n214425312565511541216241255761553545357572677756658483665857939373446447969897479456949734334458244473527726126577716551626364164343434541342\n215454511255333546211373156576753767746766243337277873455396879559858884569847593656346585362575654637328852454144255442446263233546255241532\n431315542114461265413353242417763654728735538858349557834586899333733555998884679743575576665365425435885333416351362371556142543446624325311\n441132211244444552527276456342447554548445886353434456936496689543479958679987675694674838689466724247828377642262637431716153545436542222424\n242431331426553316262677722567567677758462448438375744636357437637737547354954866633357437376596228352258264236124256266764226225656131241355\n323121453453535426317775721632377827877678522767568893488453445548375969395876375743848879797757958435424472572353376162227161161335141552343\n525113361336514413264142455647544454374577823689563368647958663483543563484633534964833647644858732558882683745555517251673646445331335215333\n332436116534513543243245763415468232724446234767873689843947686869756485746936837748455389455984597564635326653622427733567742315266623124552\n321423364544664443611566475357636824527336233645598757369976493899966746787565875656384557859777878343528563833325741753457572633216533413341\n232444445132316614542765745137364645458264896547383938669684987856485459845759546684539565534845435684545657526432633116756767425333554426214\n312323366525255545664713421226262764385826634944976757986569549474696494754644995844646943559577964479683337226885657311316544114315326122433\n432532261413643465625757211268874848228698443668399465987788645575689745947548565755485465397495575674665353433655762416747632473364142144533\n442666223614262643462522226486488384463454565653955484767795848678845686984855849668455463735654889387766447766255583147153577766455625146515\n241656226263364273264413544437366474543559376577358375487669468644447957458647565698648497334734879767677482242367842253724113176113362532152\n331356316444161717624323347727385437475466598344693557544648485864547555596559754777687957685885645983875974733855482347552531261634511313351\n346623463124144563734426275453557883835397748845946966745975469668855947499944995798945597997346576885837964343463786334126561551663634413422\n346546632246644627255213836455427753749333383937667887769757654445966667775646585769787768787488787799367848673688335233117135345526131136153\n321521223351171657635676266387762764834738436664947975977864775568997766948589644675467698649685464757489545333883665233256774267421126442615\n113454463613757576722122785286836774833494358636946857547476769968595989558574578979448756994784974836736975365462734784434474513711256544423\n261361441535263216375222433226638435468558537948779999578855958996578965598656769984659644867675987896596384385652246536756523417615316524345\n243161145311157631736252633763367473994557635765984548644954495699656565865587897648896679588968478774847436654827333666754351552634653446133\n226135365151451336224542858636357589584836469845777988469898676898678586599888575995968875447865993939376459987547637838371633417553455165351\n542126162221773443661768253224227688939876348997899659665468957985655686878579787698796575897755989888475469336685447847814527623532565436416\n212166364431161235425264647844388856793486848588958974548786599588595679767685676579784959898484675386649958763773333235646732553366114621363\n465356463267563471141522627635633838797535785459858698678766597859687965898965666756869748769445499684347889436828482737675731247144546346352\n464452162137337235656872758766255598678375965555784687675588769566598558769566595556797845998858774686795836447277575442643117266635136161643\n315236316177133415512254444436723883464443356589575656966676997886599769979597886585865794557747498864884835343375623764887347373117765541634\n543345565165721223367426422848438335784567747859894978569655867996757859699785555565899597877564766658794499743854575825264575313474763653226\n223464154576341265348276273438888473567993865478788769859799979969799787778957595579669695758458448698497333976974768563237545415713716614432\n526422665152337417376628444748664768456684687589957675865575575978999899798798895669985997889666757779438875598354344685556177743735626664313\n422466143331242541215655483447574359868594865568857985988785786758968767667987667688995859674754584744386576566825676825446133156426211325144\n616312315445772563568428468343494898673549685477858678855859576996799776676988989576855967894556694944775869596967632653456753216516325236265\n666654466273114135457582352222939756993646866879784557779765866776877899676968799678598569574487494799779674439773248573873773514243776563141\n646364141335745273254427368334873939835375794956585858689768869896987966886969889967697877578445749766985846845334486384763726635173455311633\n523556335277231462634722574533767497484597789547985699999765887799799977689687796579988897886578856746886867974944356522882725316674455563414\n116613413717173656388858823635379353844846956765756567758859958899699696986669767975996755866487445664694763789547865568347276743744163156154\n215356433444157176447344872278783673778596758567488565767957788966867899898687966695885557688956974965655397367468286572642264415742536431213\n354345565631277522377584543663753534935878564554859596575866566969987787768679769789867986657864644689563564596862833262674361644525265452154\n365245225411532566167624768678567473848757668785897585867997687696897999987696867689878585569968457655795795769677374587537446765626756416613\n654345135377622536582857544283864388873695585888788586858589768798686668977697866876569886985859654574485638466892747766245571245512351444266\n142455453364453354645883536386377533856985875557544666579568586697776896979799668795899998884545464858559434759642253466336835515614225134241\n166111335622635235382757544483453446779865995546685886597577897897886879997988789656559779694544849958433859749678585854526444636262272322151\n114123615542731734345363748253393343788459575898785876889887759866986998686866799995557677674769444777449778799487233856547565647415251555613\n225655412425222154528887828265459967598679846458787686577875979967987899696976689975556958788888957645833848879363487267375572522573754355214\n236113423313264417166673637432538857534768445878846565887567778998889766996688668997559578698655666548966788346996387466287511212346363111546\n246452426362535412434734877827987759568349697554884498877569698696697688679967776788867568586447648946473376743443326848223344317536552656551\n363262151626241673313682523373766868637935987748764459965566968797969676767866858998976779598567744496464763834933652652285122741473165662252\n141131526142762255724844244565248553995599885586564669659758667779998679768985997989976667764957468756878455785572467485247217651126563562455\n454316423641632142335572574336483878586959987448576455887995997657585867886699769789589567586784596499537895577926373466353764335464216546614\n112563253263662275723422683745849475663636586667585648757856899757689997976669575896866555759894856495984549759652785836232277444135525656565\n151146312233731235567683772855767685549774645869975547789869668665596857898569695759595698494896567589476747873425327267251316343461142634624\n113412135417256533734554576432276369847883699866758876457557675657756665756959879668985778456685788836697435775527237725385741313113213136136\n226464154124725656146657853278827553539444565748486699545699787657966768887676669589597476578788864355846969536282253285446355142577144454553\n311625513563634244276562467363762458744946859697584549785685558767956698687556986779969847454965647477564974668577578356633156776235154624415\n561312322127427517227683337578533785985343389586665554478568588657555779565986889995987557874486879476949833342723582358356147161347223642445\n142434644167621215241443466466565953634859966476585944489869988998567979776575698676659566478455784576737658935678687457467662242112433522115\n163462265125631445715772844427478846986598884646996997679495585677765987975858998878965877967856566699887383878456787685562262374546512426365\n361132545144715117335722483458665785767956544354999949479474475887976777965765958877556856579868956637857483376632742886555242224775364114335\n243114541463557315742218272865587239786849337735747976797759559976565965795568578579947654869644699836374736346566826385645163654613514412545\n454251352263426736264511474636588585849435397368577456996969588795677756545854645944964545459485874685569349342835674773127525314211423644552\n242532214563433774525353425644764782587584475648957946754885646498659968649466657678764969464667884997754843657434547567233377627331411466152\n424261164452251233542157535362337422236897757385959444756787876967495545778598678545797649487937974367447327665772782637231123771231236314444\n515333532554441217132351454364243555453754889336963656799449585659855949465676765845576967454998667958795833273725463715333535216153632232631\n323653653663135417725772243453686377733868439784777765446647897447484655964677548677957878838594468553433542737786744533543511156543261115212\n314354615336445277161562753758888632877858536933363796976477946658899998858664676744864465597776438993554862358426232251747116756556622335211\n224326523214316315365567252263738265538478658853476636698574696676574455594454755478566458355653334745728683667882725516742463335223461362554\n314321255311115543233214175443238745634774535759554735596357966846887769548485857786736944595655348554283587374434253554533432521351436626653\n251523263446646635712631434244685648455672698773346549593393548948967459856768685453776593988693545367243675434646373437732253346432236561211\n514414556455426446424517712777688337787886756936385638444945374987997777484457644789963579396768536784266555347745755734575433353616566636125\n341442461553616515152114457451274538274432425355655376745568387986578777555439793677558968596979849656756367788367617324343355146512232613155\n451312625663366356331413344567262832435478573885778985935593968796946796855783375339986637865787386876858332353422311323477475535531631554325\n555535433215113453162744225317474765772773287267679555664984633484767653866876487973489333499399733384372472562614345313512343441226222625453\n134323443422151164266762657416335254525855533627387447637339976347633759693383574677544756767474533676542385827355547427776445634421224311543\n435451426143434644454413441321634623866587858343599978369473746739655469786988388393779839773433228626478324761343772471174312266655616233341\n214451141526326626612633442633654645335867755286855346495766357576868967978963587459555756596476642628527625763767277135543543256115643131512\n123212413143634235143642117554612458282588875582543458775836863786445879896888734739878843488566865372365232754771556766521461436242325435434\n314233354152665621655153572764332535454672752628346524438648675858549467886376396693949345274522842326684733315623412521264424231124153544435\n554135154441514551543522637255534643368454536376834673635588465766357573859979838789935582276642432344458727516723736635626555324225111544114\n525343313116145613264313626473374515754364374877556486222727796668887944387975364675282622578246436473467566567324323644424665356222513243251\n352145411416251342363636121621276145164435466356646777633878785285839734683434436576773442825766377586742337726314312245332246131515214343525\n411153243354466432166256322112413463262312346674238555637277472768844684438453444682456258678886743473461572525526515713623452225331234551544\n214252522333566532311514661467135411376421456832756685768664764463464676875367562354786635638736664261376641212724765131623153465635355553332\n214311541222124266346613631213231615413373744874576427582536544482285738646572838275738656877727284537122167637351556554162515123232312515255\n344234152531331666331424646371474716677335417825367237526254544568262443223278667376488622345584332242615461544126414313536612532523251351412\n244441541231313231623634265666645251354155351353364653254822874744356677326454455587877274746725556157173577535271154454651422121455412123334\n444423555552533134251134545546524261672543466167144785557575372774256257786234663348274247487232313736245273444114342455651213153215124451522\n424235123244352114354133141226524577245146413271312266534886845222748584664484667735467747763147124165572112476512151411662151333131435331234\n441231421452513124245654613435436743711751721346167231663684332846548846735723855276458443254666543467514553172455326424353433144111455335324\n321242321244525315164331255323336223136624645164227454347367254562688587874275746787345361454562331416355475656466333354415421531121122554422\n224112254351245222534522242253551525175745126754732226213665123724334522573243565527514746164444223476227754153462142353644143522332223234334\n332322515133214141522643645363424163427156665565317662637525352635365274443472676533131352212536671144714163665565251663316251542352143423422\n432433422325353224421334464435215222437136173637131546633213744522122614145437423243456753173714337574557346165451463114454151235232553412414\n413123234525235142223141562661646451524125243571165223263374632672565723354135714564746644251135174322543131162323355255515533111551432422133\n242442431514515344545215552641165651554646264636313433656356413636342255666265574727452272546551631252355623334235114422425155232245153314224\n431433434314524114543543532555621254623334667361242744546316327671552375621361142252766135134431175645241333634311435651221521443453344134231\n411444223334455315351214145513113133134426232616747561473575561172476716457177475612674732411377534342435633416264465153342345222211433122212\n321113244431341555121212444546643562141424556113255327445344445624726766354156342312675156633713511315563532311163461342123315431554421412321\n124311432212244442522353422134332444612314255526155553332667175135264134174412426763267627272344256226156536525244244331411113141133413113433\n133133214214445143123215233434623146563514611356435543211273647473565127657144764541613452333345263535626314114554523334424314442314411444423\n143344322341314112553114345545132255233416546133633221253246241526276124126314765421564432622211461632326412416213142152341522553423223132111\n122421233212214351113253432242223144331442466145551626631662355755374756462133124442264451516441245334132462134523223441545553114422142133334\n133431211224134334112434322412454341125616362131644625246115242615314331614324423162462563154624332634561613545451323234534414443414332321443\n311424123331311414423153433545414512563145366263254464653425211664355456162355512552665342432164532655454461342512555333215434342321421121343\n221132412144432132224253322534451325325121436131114354623121166464434446366541142625524554662234654531365323153131125152222342412144314313332\n211213424114344343432524145534213543534233642253644462635534341462666125141232521234166344431635622341132441552122444315522241244234241434113\n121221444111343131433135153533121134345312123152656155343563142155266664666565134642132434545145326334421115322243252455113322141341131432213\n211121222313331244411335525513412252235422253253356654655133364333641616114266625352332235433541125143555112514152151151212112423144412331213\n321132114324214421224442245421251324255131123132336164436334161523555436463354441261613114142623515341112345415442434312244224122422242322312"

	def main(args: Array[String]): Unit =
	{
		val lines = input.split("\\\n")
		val grid = Grid(lines.map(_.toVector.map(_.asDigit)).toVector)
		grid.print()

		val t = System.currentTimeMillis()
		//println(grid.dijkstra())
		println(grid.aStar())
		println((System.currentTimeMillis()-t)+"ms")
	}

	case class Point(x: Int, y: Int) {
		def abs = Point(x.abs, y.abs)
		def neg = Point(-x, -y)
		def reflect = Point(y, x)
		def add(p: Point) = Point(x+p.x, y+p.y)
		def scale(n: Int) = Point(x*n, y*n)

		override def toString: String = s"($x,$y)"
	}

	case class Grid(g: Vector[Vector[Int]]) {
		val h = g.size
		val w = g(0).size
		val goal = Point(w-1,h-1)

		override def toString = g.map(_.mkString).mkString

		def print() = {
			g.foreach(l => println(l.mkString))
			println()
		}

		def inside(p: Point) = p.x>=0 && p.x<w && p.y>=0 && p.y<h

		val allDirs = List(Point(1,0), Point(0,1), Point(0,-1), Point(-1,0))

		case class Node(loc: Point, dir: Point, steps: Int) {
			def next(nextD: Point) = Node(loc.add(nextD), nextD, if (dir==nextD) steps+1 else 1)
			def heur = w-loc.x + h-loc.y - 2
		}
		case class Path(node: Node, heatLoss: Int) extends Ordered[Path]{
			override def compare(that: Path): Int = that.heatLoss.compare(heatLoss)
		}

		val minSteps = 4 //1
		val maxSteps = 10 //3
		def validDir(node: Node, nextDir: Point) = {
			if (node.steps >= maxSteps) node.dir != nextDir
			else if (node.steps < minSteps) node.dir == nextDir
			else true
		}

		def dijkstra(): Int = {
			// Start with a diagonal, which allows any change of direction!
			dijkstra(Point(1,1))
		}
		def dijkstra(initDir: Point): Int = {
			var seen = Set[Node]()
			val queue = mutable.PriorityQueue[Path]()
			val startNode = Node(Point(0,0), initDir, minSteps) // Need to start at minSteps because the startNode dir is a diagonal
			seen+= startNode
			queue+= Path(startNode, 0)
			while (queue.nonEmpty) {
				val curr = queue.dequeue()
				if (curr.node.loc==goal && curr.node.steps>=minSteps && curr.node.steps<=maxSteps)
					return curr.heatLoss
				else {
					val dir = curr.node.dir
					allDirs.foreach(d => {
						if (d!=dir.neg && validDir(curr.node, d)) {
							val next = curr.node.next(d)
							if (inside(next.loc) && !seen(next)) {
								seen+= next
								queue+= Path(next, curr.heatLoss+g(next.loc.y)(next.loc.x))
							}
						}
					})
				}
			}
			throw new Exception("No way through?!")
		}

		def aStar(): Int = {
			// Start with a diagonal, which allows any change of direction!
			aStar(Point(1,1))
		}
		def aStar(initDir: Point): Int = {
			var seen = Set[Node]()
			val queue = mutable.PriorityQueue[Path]()
			val startNode = Node(Point(0,0), initDir, minSteps) // Need to start at minSteps because the startNode dir is a diagonal
			seen+= startNode
			queue+= Path(startNode, startNode.heur)
			while (queue.nonEmpty) {
				val curr = queue.dequeue()
				if (curr.node.loc==goal && curr.node.steps>=minSteps && curr.node.steps<=maxSteps)
					return curr.heatLoss
				else {
					val dir = curr.node.dir
					allDirs.foreach(d => {
						if (d!=dir.neg && validDir(curr.node, d)) {
							val next = curr.node.next(d)
							if (inside(next.loc) && !seen(next)) {
								seen+= next
								queue+= Path(next, curr.heatLoss-curr.node.heur+g(next.loc.y)(next.loc.x)+next.heur)
							}
						}
					})
				}
			}
			throw new Exception("No way through?!")
		}
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}