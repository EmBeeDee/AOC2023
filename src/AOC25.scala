package net.snowtiger.aoc

import scala.util.Random

/**
 * @author mark
 */

object AOC25
{
	val input = "pcf: vqq glr rpx qcm\nqkb: ccc lxr ppx\nvnm: frl\nscx: czr\nzqg: lbj xkk\nqvs: zgv vfq pqp qbl rpt zcq\nsxm: rgj\nvrd: hbb trd fgh\ndbh: crj hjx bkj\npsx: sxc\ndsx: bjf zrx pld\ndqn: kxm\nlst: fzr\nmzv: gcq bkh mqg\nlzm: fdl jpf qxt\nxfs: zdh thc rxd cjm\nlqk: zth\nmbn: skp pxv zgv bpn\nkzg: mgc vnc zdt\nrdl: pql ptt jfm hsp zvl hhx\nnbj: tqk qhx\nrzr: cfk pdh\nbdm: ppx jcr tgp mhl\nglr: bzl snq drq prc\nqds: glk jvn ntx\nkqq: ftz blr hlr kvd\nfsd: hbs\nczr: rms\nsgv: kzb tvs qxx\nmdz: rtk txr cqr\nnvc: vsr kzb\nbkp: msz vpn fzr\nfbq: txq sbn\nxgq: dng xlh cqb\nqsq: vvr vqz xpv nlm\ndhk: bqm fvg cjm\nkhs: dqq tfb\nblm: lqb rcq dmr knp\nvfb: tjm ltb lcd vss xvg\npsn: hrb hzt dhk hdg\ndtl: jgv\ntgf: rnk\njlj: rhq vmq scj fsp klg\nnbt: khg dvg plf\ncng: gsf\nmrr: bht\npbf: pxl zbf\nzpm: tfc jrm jfl crs hsp\nsfh: pmh jfl nhf vct\nfdl: jtj\nqtl: kvn glk cjv lrd\npmv: mpj mmp\nqfv: nph klg kxm cmj vxd pqx\nmjn: jfk pql\nprc: nzf rjt\nqnc: kbt nth\ncml: gzg lpz pxs tvd lvf\nnxl: mgg tnt msz\nrqp: bkj nbg\ncfb: slr bmv mnf tgp bfm\nsff: flz nlq jtc rkz\njzk: txm\ntnt: szr ljs\njhm: sms gll\ntjm: vvz qsf\npsh: qsf\nftf: rkn rcz ddg hbx\njfl: rll\npxp: dtc nqq cqb sjd bdg\nhfm: xzs krk jpj hbs fvg\nfvk: gnv bjh\nrxt: dlr sbg\nqhk: dqp tzz smc rxh\ntbf: tdl\nvms: sgl\nmps: fth kqs pnr fbq\nsrg: ndj gdq\nvzk: ggd dms vdh zdt\ndkj: drk zmv kkb sjs\nhzg: drn cmp gxf mkr\npqm: gmf krk vvc ldb\ndpb: sdj bgh plm\npnq: fxt mxg\nmlc: brv hld mzz\ncxx: vrx zcx xxv\ncrj: lxr vgl\nstj: tsm xxv jpj ccl\nzcl: fvz ntx\ndpd: brv sms frx\nsnm: lnn bqx nqm kdr\nvdx: fbm cqr fpg pdh\nqjv: vhd vms\nxhm: lhz kkv lcq\nzgk: fkc vmb vjj vtg jqs\nftr: crq ntc bsr\nrst: cxm\nxxm: mld\nqxj: nhf dns\nlhr: znp\ntfx: lgs skp fdl dsb\nmzr: qps\nkjt: kzb xbb\ntzs: cfk sdg\nxqr: lbl pdv\nbjf: vsz lft\nxnh: tfv lnz\ntqk: kzn\ntht: dld kqh cng rlc\ntsd: kng ndm\nthn: gkg\nxth: bns zgv fth bfg kzc\nfjx: kxm\nsmx: tjq pmv nbj hdj\nzdt: xtp zkp hpf\nzcm: njk vtl fvk\njbj: nrg bng jqs vgl\nczm: fdr zbf dkt\nrfk: rbm grf zqb\npxn: cjv jfl\nzxp: dvt qvk cfv pst\nlrc: dpp jcr ldh bth\ndjx: hpg dlm\ngvv: rlc ppn gjp mdv\nddb: xgx rft\nqrx: ckt bdg mmh\njxk: psh dbp cbn dvz\nbxk: mrq jzk cpv pqh\nvvc: nqm ngd gzm\ndrd: tzj jgc nzf rxx\ncdn: jhh pxl xdc lgk\nzjz: ldr cfb bfm\nkkb: qnn dmp\nctv: tfb gbh\ncvd: rhq rcn hcx\ngxb: dfn vzc\njtv: jjz bqm\ndfb: fqz zmr pnr nlq\nptr: dfv lqm\ndvg: clp\nqgz: qzq tlk jzt kqg\nqct: lbv gxh vdh\nhpg: hck\ndlr: jvj\njgv: mmh\nmmp: hck\nkrk: lqb\nksr: ggd fzr dsm\nncb: rxt kqs hhx mnp\nzcx: knr mkm\nzfr: gxb dsm xqg\nhpr: txx gpg\nbzf: dvm\nqjp: qsh\nqgh: sjd cpv chv pxl\nvnk: pxl sqs glp\ngkr: vtg bnj bng tdf\nsxq: ltl ksb plm\nlcl: njk zjl tsm\nvkq: xzj dvm\nbrz: drl str\nnlk: jnc\nzpj: rjz psh zvt\nvct: frl pql\ntfp: zsm rsl jtc smt\ndrx: xzk dzt\nhrb: kzs clp\nvbs: pbf zzh qlp\nhqc: crc pcb kml\nqld: hqf cxm rlc vkd\nzjb: mft mnc xpv kjc\nplv: zfr fqq fgq xkh\nbrr: fbb mdz dpd hrb\nqzq: rhd zgn\nzgb: fft ksj jcn\nqgr: cmj bsr trc\nkdr: qns fsj rpx frx\nnqk: mtv zpj pbg nvh xvv\nkzz: blv gzm\npld: pqx rcn\npvm: qnd\nsfq: gkt\nnqb: mkm kzs\ndpl: qxf jvn fbq qxj\nlrn: jcr\ngkg: nsz\ngkz: rlf cbh vcr lzm\nktf: hbz ncs qnd knm dmm\nlhl: mgc qnx\nxjk: mqg hlh\nfzv: dbk tdf\ngxh: dns\nkfh: dsb\nxqg: flz\nztz: jfv thn\nkpv: hgx tqt vhq pxx nmz\nbbt: lgs jhh\nxnj: dlr mbz\nnzl: ggb lsx\nzqz: psx\ndlb: brz rgm\njjf: bzf qfh cdf xbt\npzr: nqq cqd sfk\nnzf: mdv\nkmn: fvk lbm\npnb: jcn\nlkh: qkl gjp fkc txr\nfft: bmt\ntpn: vmk mjn qtv\nhbb: chn\ntbx: ckf rfq szr vmz\nfqv: mbg ncs vjj cxm\ndgb: qxj trf gxt nlm ntx\ngmf: hkd rlc\nhzh: scj bxz mrv xgf\nzmm: rcl\nhpt: ltt lft sjg qpl\nczv: vms lqm zlb\nfsk: nvc ztm rqp drl\nrqq: fxc nxk vbs\nggb: fsq kcv\nkjb: pkd\ndfn: qnx gqf\nhtg: dzv sxx krm\nptt: zpp\nsns: rmd vgf qbq\nfcj: cxq\ntkb: ldh pgx ccl\nfml: rcz znp cqs\nflg: pst glb nfs tvs jhm vck\njgk: bmt vdv mvr qxx dcv\nbqv: chz gfh znd\nzzh: ljs qsf\nchp: jvj\nhhg: cnh\ndgl: rdc gzm xjh lrn\nczf: dvz ntx\nncr: bbx\nvhk: pvm mkm khg\npls: mcd knm\nbmv: sbz gjp ncr\ncxp: kzs lrn rdx pjg vgl fkl jpr ltx\nscm: zbf vvr\nrtz: jrr gdv\nndn: tgh\nccc: jtr\nrmq: ldb dlb htj\ndbp: qxt kxh\ndmk: bbx hmj\nfhq: hbx jvj mfh vnv\nshg: btd\npdl: gzm\nvfg: bbt\njjm: kxh xbl\nznq: vcn cvc lgn\nbcm: jsz rdg rlx\nbdf: tqg xmc\nvqz: chp vfq\njdl: rll xzz bkh kdl\nljf: kpd pfk scx kdk cxd\nzqs: shg hxt vsc ctp\nfks: svd vgn mrq\nxgx: vvz\nxxv: lzx\nlbj: zbf\nznd: tfv\nnpm: nxz qxx dxb\njqp: czv ngd pgx txv\ncgf: frn rtz qgh rfk\nrhq: jcr cdc\nfhx: zpp tbx dbc\nnnb: ldr\nrpv: gxd dtd ctg sfh\nfth: jzt rkn\nqzx: pmv mtj pgl jzk\nxhk: qtt qml vnm fqq dlm\nhkx: jgl xqg nzn fpf\nxbh: jcr brv zcm dvg\nzpf: vzv mdn ksr fcj dlm\nnxp: bhs zlj\nksb: fnx qnd\nzhz: hxt rjz txq msz\ngkx: pbp xtp lfx ptt\nlgp: vfg mqg qnx ctn\nhjh: sjs flz\nhjx: pvm\nglm: xgf pch gll pvx\nlpz: gxf ptt kfz\nfdr: qlp jtj llk ptv qff\ntqp: jkt sfs\nbtx: cqp bpf kpv zkd\nzrh: jsv nzf qvk jjz fpg\nhms: xxm\nvzg: cdc jnj\nqkp: plf pbd cmr mhc\nvtc: gkt zjl\npsv: tdd fqq\nkvn: jkm pgv\nnbc: tfv rdk\ncqd: dpb btc\njgl: rzb\nlll: rcl\nskf: xgf zpq\nmcd: tqg lkm\nkqh: bjh xbt hbz\nldn: zmm tsd ksj\njqq: xrv\nqfh: qkb txv\nmpt: fft hgq jjf ltl\ncqk: nbj lgk chz rkz rtb\nhtj: jqs kzb\njlx: tgf ddb\nprq: knm dzv rdc jsv\nsgh: njr dzv cxx khs\nplb: zjm jsl vfg zqg\nrnj: hrj dng\ndzb: zlb xqp qvk\ntxf: pgl\nsxt: mdv qvk vbc\njqm: jcr lbl qjv\nqcq: rst cdf msm vhd hzt\ndnr: sgl qgr rdp snl grb pbd\nhmx: bpv bjh mhc vtl\nxdk: qnn mgg glk fjc mft\nldh: txr\nchl: hhj pnb pzr bpx\nckf: qff kfh\ncvk: cfk pjg fzf mfg\nzln: zzh xxm\nggx: pbd rqp\nvsr: bqx bhs\nrjz: nrs cxz\nzkd: grf gfc\nbbx: qbc\nrkp: vct\nvtg: qsh\ngzb: dct rmk xmp znq hkl\nlzx: pdh\njzt: qds lnz\nmcp: ckf xlc lrd hbc jkt\nbrl: qbc cfk\nxmp: czk zvg\nddg: lhr\nsbz: gpm\ndjv: tzx xbb kns fsp\nqhb: xnx kxh vsc hxz\nqff: cqs kmj qml\nhck: zvg\nkqd: bhs\nlmv: zfm mlk zrg\ndng: zgn\nxdj: pvm csq jcn\nxmm: qml vpn bkp gqk dns\nggg: cxq\nmdr: qlp tcp\nhkl: lhr ccv\nmhf: vtg qvx dbk vsz bng\ngpg: xrv jfq\nmfl: psd mgg vvr gfx\ncsj: nqf svb jtr\nhlh: txq\nbjd: mtv fdr nmg xlx\nfpk: pmh thn tnt\ndqf: ltl cbg mfg chs\nfzf: sjg czr\nbmt: krm\nbrv: bbf\nfsp: jvb svb\nmfd: ltl pqx\nfvz: dtd\nchn: rzt\nbqk: hxz lcd jrm brh\nxkh: lql pxn mlk\nltx: qkl blv\nmxc: ddg cjh ggd\nhxm: mpt tcm rxh fmn\nnbx: zsh jxf nxr rsd\ndll: xzs qdm cpq vbc\nrtb: qzq tqt bdg\ntrd: zsm\nsfl: szh gdq\nrjp: tcp svd\nnpk: bzh btc kjt hhj\njrg: ltt skf hbq nbt\ntxd: zfm rll rzt ccb\nsqb: str\nmbz: gxd\nbrk: qdr sck dqq\nptl: fzr\npdq: ljs zrg clk\nbpf: sfs\nxss: tch smk fjh pnj\ngfl: fsn zcq jzr hxt\nbqn: xbz jrr hbn hxz\nfxd: rsq\ntln: rjt vxd tkg qkx\npml: hrt dbk rmt vmb\nrqv: zgb rxh\nbht: xnj\njfk: brh\nzcf: chn xkk flz\njsl: dcq msz gxh\nvsh: mbg dqn ntc hzm lft\nsms: bbx xbt\ntpb: rgl rzm vcr sct\nzqj: blv zlj vmq\nlch: jnj mcd kzz\nctm: ggg fgk sns\nsps: pdl mbg\nzcj: qpv\nlkm: vkf\nmvr: dfv vsr zrb\nthq: btk gbb fks bns\nhrt: fcs fck zgf\npvr: rdk tpn qmk xlx\nxxq: hld mpb\nqmk: mpj\nfdh: qlb pns vmq\nxlc: gfc qpv qps\nqmz: kkc ptx cdp vgh\njvn: nkr\nvdv: thc fbm\njfj: vvz txq xnj czf\nztc: vxd kqd zrx rpn\nsxx: ndm\nhsc: ggb rzt hkl hgd\nnmg: jqq rjp\njhh: zvt\ngqk: rqq znp xrv\nrdc: zmm\nmxg: nqm\nfxt: krm htj dgr\nxvg: fgk fgn jzr hms\npxd: pzv xnh hbb\ngbh: fsj\npns: nrg\nqvd: rms tvs ksh rsm\nxrk: pgl rkp clk tjm zsm\nfnj: nkr lpr qxs jgl\nrnk: qps\nkqg: ptb\nfpd: gvt rst nlk mnf gzp\ntdf: vzg fsd\nflx: rgm\njvr: mcl mbz\nrgn: rzm cdp zzh sfx\ndcj: zpq\nmcl: glk bcx\nqtf: rcl snh\ngrb: nff\nbjh: fdq\ndld: cfb pvt ptc\nchz: thx jqq\ndjt: rzb svd lgk hrj bbt mdb\ntzj: ldr nlk\nhqx: jvb\nqtd: pns pvx zks qjb\nplk: pls txv pgb zlq\ndcq: hvb xqv\nmst: dcq cgq mnp hlh\nfss: dvm\nlts: smt ppl nnl lhl\nfvc: nhf nnl ctm clk kmj pxd\ndcv: bsr vjj jcr\njbb: rjz rnk njb\nrnf: qml\nblk: tbf sbn sqf kfh nzg rnj\npzv: kqg fnn\nvlc: flx ltx qvk hmv\nxqp: xmc\njhg: zps drq nxz\nlkc: dvm zxh dqf thc\nkhg: gpm bzl\nxpv: gls\nnhh: lck\nmbc: pld rpx tkt bxp gvv\nbff: gvv xjm nqf btc\nrnb: qft vlf cdc bzf\nbpv: bdv mdx\nkbt: mdn\ntcm: snl\ntfv: sjd\nbtc: ngf\nntm: dcj mfg\njdv: fsq xxm rdg pxn\nfkt: cbn grh\nzsh: sdj brx\nfjc: nzl\nshj: kzn gfh qnn\njtc: jfv\nnsh: pzr nhh kpd xqp cvd\nxvf: txm gxt\nbxz: brx snm\npcb: qxt tdd\nxjh: bqx\nrdt: kcv frn zmv\ndtq: qfb pkl chs nmf\nnqf: zbk sfq\ndkt: cjv qmk\nnqq: hbs prc\nrsd: klg kxm dmk\nllk: lvp tbf tqp\nrpx: svb\npxs: qxs vhp mrc lxg\nhgn: xmc lzx rms\npst: vkf lqm\nbxp: dxb\nlss: tkb lqg dhg zpv\nglb: vrx scc\nchv: zsm\nvcl: dtl jgv dmg nnz fdg\nkfm: mjp vlg\nfhn: hxs rdb ckb jqz\nlsx: zcl\nmsm: bdv tch\nqfs: fgn tbf gdv\nhdg: mkj vkq pnb dld\nfvd: xhp chz tvd htd\nbcp: psh fcj brh\nqvx: qpl zpq nxr\ngsr: hgn gzp qvk lkl tlt\nmxz: fmn mql vsb krt\nrcz: vrg dcq\nkdl: rfq tvd lgt\nzrj: gdt kfz xcp mhx jfk\nnms: lnv gkr jvb hbq\ngns: snl vvc gzp mjp brx\nzks: qkl\ngmt: gqf\ndhg: dpr\nxvm: zzc\njlq: jrm\nvjs: tpr cxn rdx lmh qdr bkj vhd rmq\ngbb: tmm dbc\nrxx: tlj gbh\nkjp: zjl dpd brl\njgc: tzx pgx pdc\nnxk: vzc xkk vmz\nktb: xbb ndj xvq dbz pzn\nctn: sxc jrm\nlvv: rcl\nqbl: grh zsm\ncbh: gqz gsc\npvt: xnb bzh\ncfv: rsq\nqfg: xlf hbn nsz fbz\nmlp: ggh xxq zbc dvt\nqgg: btd rtr mtv\nbtd: gxd\ndxs: lzx ftz njk mnf\nlqg: ztm jxf\nqtv: vcr\nhvn: lsx jkm vvr nzd\nxzs: mzz fxd plm\nzzc: kqg fxl\ntlk: jdq rhd jhv pbp\nhld: ppx\ngcf: pvx\nszr: rdg mft\npdc: dsx krk snq qqf\nrzm: mnc\nmnp: jfv xqv\ntdd: vvz\ntpr: hld czv vzq\nkml: nzd rhd\nskn: xvf tqp sss\ntlv: nxq\ncvg: ksq zls lfx rft\nlxh: ntv mkr jhv hgd\njxr: svd czk nzn mlk htd\npxx: cfm szt jhh\nnjj: dcj kqh vzq\nhlr: pqx\njrm: fdb\nsct: clk zmv pqp\ncnd: xlx tgh\nrsl: fsn\nfpf: zkp\nsbq: hmj hhz grd rgm\nvgs: fsj zxh rpn kfm\nqns: mpb\ncmj: jnc\nnbh: fsq\nkzc: gxh lfc tfc\nrsm: kcx jtv\nccv: dbc\nbhq: fbz pmv szt\nshz: kkc zqs svn btd\nzpk: rft vfq tgf\njpf: ptv\ntpt: lnv cfb nxp krm\ndfh: dpd trg vrx xjr\njbm: xtf cdf zrx xsv\nvxj: htc bzx qsh\nnvk: tgf hbx dks shg gcq\nrjq: rhc jqm cnq\nbgh: pvx str\nght: lcd gqg tqk rcc\nhhx: txf\npsg: gkx cqs flz\nhbc: jtc qnc\nnvx: svt rtk qnr nqb\nqbv: zps pgb\nxms: cbn zpj\nkdj: rtb qbq tlv\nvsd: mfd pvt dhg\nxcf: drq\nqqb: pqm thc jtr crq\ncxn: jjd svb fcm\nlql: svn pbf mft mdr\nzlx: pld cng dbh tsc scc\njck: mmh\nsdg: xmr ppx\ncqp: rnf nnl cbn\ngtz: mxg ccl xpk qdh zcx\nzpp: sjd\ndfz: fxn cgq tdl mdn hfp\nhzm: ltl\nzrs: pgb\nxrm: mql dzt hbq\nhbx: tqp\nkxq: rmd rmk rgl\ntqg: hbz\nvjj: bqm\nlcd: dmn\nhvl: gxl zrg xpv gfx spt\nvrh: qtf zks zsd vkn\nrbv: kzb gsf\nzbk: rdc\nldb: fkc\nvqq: gnv zmm lkm\nmkj: sjg\ndbz: gtf pnq\njsp: sxg hzm zkt bpx jpj\nsnq: rms cxm\nndc: vmk znd zln rdk\nxkq: jkt vsc fdb\ntph: psg ddg czm lgn\nsxh: bzx pcf\nrmt: mql qtf ldb cqd\nqrk: bth hmv csq bxp rqp\nnph: nld\npnn: znr zvt lxh tlk zmv\ngpt: lgs znp hlh mrq\nxqz: nqt clp tcm\ngfh: sxp jfq\nxpf: ctg kfh fvz dkd\nvzt: tcm hbq lck tzz\nmrq: xqv\ncxd: cmj xxq xxv\ndvt: ctv\nmrv: htc lcl sps sck krt\ncrs: dfl mlf xgx\nxbl: frh fgq rft\nxzk: rbv qcp\ndbk: gpm cbg\nkfl: zlj gnv\nngk: sck sqb scx zcx\nxvq: qkx drq lqm\nnlf: jnj\nfgn: xnx\nktr: qnc hjh fxl\nxmh: zcx ptr fjx mtl\nrkk: crj lft fjx hgq zqj\npzn: zpq sfl bzh mjs\nhxs: frn\nvvl: hxt hms hxs mnc\nmlf: frh\nqcm: kpp dqn\nbkh: qmf\nthx: mfh gsc\nzvm: xhk kmj zqb\nclc: njj tgd mdv dcj\nxmg: csj xrq xcg bnb\ntvq: cgq cfm\nrln: ggh ksh hjx brk plf lrn\ntkg: kpp zks\nvqh: xjh nqb qbv vlg\nbdg: fnn\nmdb: jqq pql vnk\ncdp: rcb gfx\nxgh: sbd jfq\nbpj: plf kxm rhc sms\nkls: jlx sqf fxc zln\nclk: chv\nnmz: dvz pgv\njpr: nbt\nmpf: nth ccv htl scm\npct: qjp fjh rqv vrh bzf xdv\nrfq: cmp\nkns: nqm\npgx: tgp grb\ngzp: qjp\nnxq: vcn\ngzh: tzg tlv\nhbd: csq zpt sxg bgh\nfds: xrb zjb vcn gqz\nfbm: ppn fxd\nzpc: zkt zbc ncs kmn\njxq: dlb rjq ccc jtr\njjd: nff tsc qkz sfk\nstr: sjg\nzlb: mql hqf jpj\ngbm: hhs vpn gzg ddb psv xvm zcj\nvmk: ndn jcp jlg bns\nhgx: qtv fgq zqz cfm\ndmg: vhp jtj\nlrd: svn nbj\nbng: qsh\nkcx: lll ndm\nhsp: mmh\nxcp: hcs bhq qhx\ndkq: fzv cnq npm fjh knp\nnmt: kdc qcm\ndlg: qds fqz gvn vld\nmnc: vnm\nrvt: jcn trc jsv bdf\nxcq: dks rsl kzn gvn\nzmx: lst ckf czf\nhfq: zmx qfs mgc sqs\ngcc: tqk lks rkp\nnnp: drl pvm\nmbg: drl\ncqb: pnr\nrpr: rhc hgn fck zrs\nppl: njb bht tvq\npnp: tsc rxd zgb szh\nbfg: sjs\nntc: tzx dxb\nxpk: ccc gcf rtk\nrgl: sxp hjh frh sss mnp\ntdl: jck\nvkt: fxm hjx vdv hlr pls qcp\ntkh: kjb nqt tsc rvx\nhrl: rtr sfx vpq tdd jvn\nnmf: ztm ndj\nzxh: pdh xcg\nzjm: cpv cxz\ndmm: rtk\nmrk: xdj pdh bdf sdg\nrdb: zcj kxg\nsmk: hqx mpb\nzbc: gjp nlf\nplf: dxb\ngll: mpb xcg\ndmd: ckf vnv gcd nkr\nnxr: mxg rvx\ntch: frx\nfbb: fsp qcz sbz tsm hmj\nztm: cdf vbc drx\nbpn: rcb rdb ckf\ndpp: qcz trc vtc\ngdt: qml ggb\nvmb: xjh dzt lvv lqg bbf\nnsb: svt zxh ngf\njfm: ptm nrm rmk\njdm: lhr bpg mbh chn mtv\ngcd: bqr lgz\njhv: drn tqt\nsrd: kqg rzm fxc\ntrc: txr str\nsgr: khs scc dkq kng\ngqg: hrj djr dks\nslr: qjb sgv tkg\nddv: smc ntm cpq xqz\nbmx: lck gcf qpl\nzrg: rnk\nrdm: bfg fnn ctk vfq\nhzt: qcz vkn\nlfc: grx\nnfs: jpr vmb\nfjh: ntm\nzpr: hrn cnq mlc rhq\nhrn: pkl vgl\nmsj: qdr nsb qnr hxc jxf njz\ndmr: pkl kzb\nnjr: dfv pnq\nbjk: lvv dbz hrt rjt\nqqm: vkf ggh glb nff\nnzg: vpq zls\ngxf: cgq\nbpx: jcs bbx\ndtm: fds htd flz xbz\nmld: fsq\npbd: jjz\nptm: vrg sbn jdq kjc\njqz: dkt sdf bcm sfx jvr\nfbz: ssl xlh\nvkb: vpn hkl qtt vpq\nkhb: mrr vcn tdj gxb\ndrn: bns\njjv: jtc ptb gxt shj\nqxs: rcb\nqvl: txf ckt nkr htl vqz\npcp: rgj lgt frn jbr\njcp: hpm fxn nlq\ntrf: vpt\ndms: kfz fdb\njzb: pgv cnh\npgb: scx qxx\nrdx: bmt dgr\nxsv: xqr srg pct\npbh: vdx scj sfk rdc\ndct: kns pmh jck\nklf: gfx\nglp: dsg qxj xcq\nnld: rxd\nshc: qmk\nzpq: tqg\nqhm: smc xqp cxd rsq sfq\nctk: rzb cqs jfv\nlhz: lmv ptv\ndcs: gzh qgg gpg fpf lxg bkh\nptv: ptb\ngzg: mdr\nsbg: ccv jgv\ntvd: dvz\nqdh: thc chs\nfgb: dmk rvr qfh tzs\nvrx: ptc\nfxn: ptl fxl\nksj: pdv gtf\nlcq: jgv sxm zgv\nnjz: mhl gcf jtv\ncrc: nbh mqg\nnff: tzx\nkxg: ndq dkj llk\nhbn: qgh nhf\ngxt: mdn\nqbb: fqz zcj fvz dmn\nbsp: lzm rnf cfm\npkd: hhj xzj bjh\nqmb: kdl shc cvv fgn\nkmq: nmt hft bqm qcz\nxkf: nxq fjc qpm ckt\nzcq: jlq mcl\nhzj: zjm qpc crc nzl\nlnv: vkn\nkpd: htj xnb\nzcz: fsd bqm nbg tln\nlmh: pkl\nntv: kjc hbx jgl\nszt: kcv bcx znd rdg\nzrt: tsd hlr nlk nnp nph\ncnq: tkt\nbgm: kpp mdv fsp\nbfm: rms\nmhc: bzx\nzxg: qpm xvm zvg nlm\nbpg: xgh mdr\ncqr: jsv bqm\nhfp: jfq sxm\ngfc: sxp\nvss: mld tlv nzd mlf nlm fml\nlzv: xlh vct ltb\nkch: fxn rjz dkd lvp pxv\ncmr: jnj dqp hcx srg\nktc: ths rsq kjb zpt\nhhk: dbp dsg tzg njb\ntrg: vbc jtr xzj\nhcs: zth cnd\nnnz: hck dmp bpf djx\nscc: lck\nlvc: zzc blk psv mhx\nxbz: qtv lzv\nbqq: tqg qkz kdc\nngd: hqx\ngrd: fkc vhk hgq\njcs: zrs qft vxj\nsbd: hpg\nqjb: crq kfl\nszh: hkd\nfrn: zkd hsp dbc\ngvn: zzh sxp\nmjs: fdq lnv\nxxz: cgq mgg jpg shc rfq\nmkm: ggx\njqr: sjm fsn hms zqz vrg\njpg: mlf\nksq: ktr ssl blk lpm gls\nxrb: nzl tcp mzr\nxtp: mrc hhk\nqft: xjm frx\ncfk: dzt bbf\nlbn: vkb gbb\nhtq: ggg bpg kzg nzg\nvhq: sxc\nbsz: rcn pdl glm grd\nqjq: kxq nvk tmm jfj\nftd: kkv gcd mdr mjz\nrbg: pql hvb zkp jgl\nphj: fxd gmf qdh ldn\nrjh: fft sxt kdr nbg\ndrk: cnh\nxhp: bsp qct zhj\nxlf: lhz nmg\ndbf: gpm vtc nzf hqf\nsnh: drl cjm fxm xmc\nlsp: qnn\nppn: zlj xcf\nxcd: dmn xbc vhq sqs czm\nlbm: gkt pkl\nqbt: sbd jtj vzc\ncst: hxs fgh jxr lbn\nllz: lbj psd zfm xqg fbq\nnvh: dns tfv txx\nzjn: rdx ldh bkj qkz nvc\npnj: nlf vdv lch\nzvq: rgm msm tlj sps\npfk: tcm rsm pls\nfnv: fxl xlx tfv\nqdb: rnb vbx flx qjv\nnln: jvr dng txb ksv\nvvh: vzg hzm zrx ptr\nrmd: lvf chv jvn\npbg: dfn gfc gdv\nvbb: vlf ptc qnr bmg fpg\nhbs: gsf lxr qjp\ntsm: qbc\ntxb: jbb dtl hhg qbq\nmvd: rqv mjp vvh bqx\nxzz: zkp trd\njxb: pns ksq hhj jqm sck snl\ntlj: nlf zpv\nmhm: vfg tzg qpc gxd\nxbr: txx mrq tqp ksq\nzpt: fbm pjg mkj nmt fsd\nksz: nbh jvj drk vrd\nzhj: mdn mjn pnr\nhjp: bhs dqn rxh qbv drx\nqdm: kqq nhh vzt\nssk: xzz xms lvf lsz\nfxc: cnh\ncpq: mjs kcx\nlgz: gcq pbp\nxkk: mmh\nkdc: zbk lll\ndkg: dtc xvv\nfqz: srd lgz grx jjm\nrjt: vkf\nmtj: mmp pmh btd\nxmr: qqf bxp czr\nlvf: fxn\nrzt: vzc\ntfc: qhx lqk\nhpm: lgk rtb vvr\nzmv: rkz\ngdl: jrr gcq gcc\nbmg: nqm rbv\nklg: dmm\nshs: chs xjr qsd rsm\njsz: ckf czk tqt htl\njvd: qsf zhz\nvll: rjp gvn jfq cjv\nvhp: gkg dks\nznr: ptl mzv mbz\ntdj: lhr fcj xvm xqv\nbzh: ksb\nfbg: dmr ccc\nqfb: gnv zbc xqr\nxbb: kzs\nckn: ggg mcl sjs qbt gdl\nsck: hjx\ntsc: sfq\nqpc: lvp\nlfd: sgb xnx xms jpg bcp\nlgt: bbt vbs txf\nmrc: sxm lsp\ndsg: nxl jlg mlk fsn\ndkd: lsx ptb\nqpl: fck\njrr: dsb\npzt: lbm tkt jjd qbc\nbnj: hbz bng\nsxg: sqb sfq\nfpg: lxr\ntzz: qkl qdr\nxrq: scc kdk mhl fvg\nbth: fdq dpr\nfsn: trf kkc\nfxx: xpv lxg smt\nmkr: lqk tnt\nrpt: kxh gqf kbt\nmpj: lbj\nqtt: zth mdr\nzvz: bff dqq cnq csq\nqkx: pnb hgn fcm\nhtd: zgn\nldf: lll bpv bsr knr vlf\npzg: kkb ggb rnf\nvld: psx frl\nnzn: tdd thx\nfhm: kns xxq fsj txv\npxg: svt vms dmm lmh\nqlb: pch zsh fkl qnd\nnlm: nzd\nhgq: hbs\nnbg: bzx\nsjm: dkg nvk xnx\nfcm: knr htc hqf\nqlz: kmn nqt zlb sgl\nnrm: jlq ptx fkt\nhdj: mft xlh rsl\nvzv: gqz mnc zhz pzg\nvlg: zpq jqs\nvfq: jdq\nvkd: krt qkb hbs bpv\njzr: qpc dvz\nvgn: txm jlx hvb mcl\nzqb: cpv ptx tzg\nsgb: qbl txf ndn\nqfj: rst qsh bfm fss nfs\nlzp: rtr gdt fgh vhs\nmjz: lfx htl fpf\nklq: tbf fqq ndn xgq\nnzb: ndq hhx gcc svd zpj\nxzj: tfb\npch: nxz qvx fzf\nxdv: kjp rnb qxx\nzlq: nrg zbk nnb\nrvr: sxx hss ccl\ncpk: dkg djx fxx\ncmp: skn nth\nbmn: hkd tvs xcf pdl\ngzm: cdc\nqbq: jsl\nmdg: zvt rdk mbh\npsd: drn\nhhh: vnk jjm fhx ptv xcp jzb dtm ztz tgh\ngxl: sqf kzn\npbc: fgk qsf sjs vvz\nfdx: jcs dpr xcf\ndzl: nbc dfb dtd ljs xrb\ncxq: glk brh\nlft: mbg\nbnn: rdt vld qzx jqq\ndfl: hsp frl\nnxz: czr\nggd: jfq fgq\nkrt: zbc\nscj: rgm lnn\nknm: pdv\nksv: vnv xvf tvq\nvhs: bns fxl sbd\nfvg: dzv\ncjm: khg ctv\ngdd: sfs txm jnv\ngff: xgx lst hhg xlx hfp\ngvt: vsd hcx zgx\nxdc: cnd tcp ccv\nlgs: zgn gkg\nsnn: lhl qxs mfh nbc\nckb: mzr pdq mpj\nzmr: fkt xrv mrr\nhhj: ngd\nhxz: tfv\nmmr: mtj pzv tgh vrg\nqpm: rhd hbc vqm gvk\nckt: njb dfl\nmhx: gvk mld ctg fzr\nhjm: fbg ndm mfd jsv\nsdf: gxf lsp tfv\nrkn: jzk zcl brh\nlbl: pkl\nlhv: qbc fjx jcr vkf\ntsp: xlf vhq spt pdq nbh\nzls: jfv\nqvv: qbv bdv plm mfg\nzpv: csq qxx\nqsd: nph hld bdf\nfgt: xzk qpl xzj zgx\nqxf: zvm fpk fdl\njtj: nsz\nkpj: ncr njk cfk\nsmp: bfg scm dms ctk gxl sbg\nfdg: kmj xbz rzb\ntmb: kzz nld ksj zjl\npks: fzv sxq ngf dpp\nlgn: shc kkc\nvpt: txm rtr\ndqp: lck bzx\nqbh: lfc gzh pcb\nkjr: bpf chp jlg xnh\nxbc: hdj vcr xdc\nkng: brz tfb\npbp: qhx\nxjm: str\nckp: pdv bqq cng xrm\nsgl: nnb\nvql: jvd psx xcq qnx\nfnn: kbt\ncvc: bcx xvv ctn rjp zpk\nmbh: skp dlr\nccb: pzv dsb shg\nvgf: gsc ddb zkp hpm ptl\njpp: rcz lnz chp\nhgd: czf zzc rkp\nlks: grx dtl xnj\nklv: vnv kdj qrx nxq flz\ngkv: htc kqd xgf\njnv: xkq bht mgc\nkcv: vqm\ntxs: vvr rnj pxv jvd\nhkd: gkt\nbtk: vct zqz spt\nrvn: xhm kvn tcp rll\nqcp: fkl\nqnx: nsz\nvck: ndj nnb nzf knr\ndtc: zfm drk vpt\nbnb: sfq bxz gvv\nrsp: nhh htg lmh kpj fdh jnc lqb\nsfx: gdd ktr\nctp: zqz pgl sbn\ncvv: vnm gsc znp\nmjp: vlf\njrp: jgv grh qps tfc\ntvs: kpp\nfcs: dzb kfl gtf xtf\ngqz: mqg\nzgv: lsp jpf\nktm: sbz mkj dpb mnf xjm\nlkl: vzg sxh vhk\nlbv: bcx tdl skp\nzrb: dpr jhm\njxf: gtf\nblv: dgr\nhcx: kzz\nzsd: bdv dbh fss\nhmv: xbt gpm\ncxz: jhh\ndfv: cfk xxv\ngdq: nxp ptc\nvtd: kfz zcf kbt\ndmp: gmt\nflp: hvb kml thn\ndqq: vkq fnx dqn\nltt: mcd dgr\nbpd: dfl hpr ggb xnh\nrcc: jpp sfs lxg xkh\nhpf: mpj jrr gcd mgc hbb\nfnx: kpp\nrlf: pbf zzc zls\ntlt: qxx qkz tzs\nsqs: xjk\nvmf: rnk frh rtr\npxv: jlg\nznp: vqm\ncrh: bpg rxt nrs smt\nxch: qjb qqf prc\nmtl: bnj rcq xch\nkcz: sxx jnc brl kns\nkvd: qqf vxd rzr\nxjr: kjt\nths: dvg hrn hmj\nrfh: fdx nqt qnr fbg\ntmm: vqm jfk sxc pgl\nknp: rgm gpm\ntxx: lst\npqh: gzg xbl sqf\nvzc: lfx\nkkv: jtc plb\ngpf: sxg sfq rcn\nftz: bzl jtr\nkdk: bqm njr\nhrj: jdq\nngf: bjf\nrmk: fnn zcf\ntdc: qzx czk grh hqc lcq lbn mxc\nvbx: jhg zrs vsz ggh\ngvk: glk sss lqk rgj tlv\nvmz: gdv dmn xkk\ncjv: ctg vtd vld zqb\nzps: sgv rcq\nzdh: kjt kdk lvv\nrlx: lfc nbj rzm\nbqr: gqf qxj jlq grf\nqcs: zqg btk grf mmp\ntgd: lqm gsf kjb\nhss: rzr gtf mdz\nqlp: zvg\nzgf: zrb sfk sfl dvm bgm\nbsr: kng sdj\nhmj: qns\ndsm: cxz gcq\nrcr: ldn xjr zkt skf\nldr: fmn lkm mdx\ntkt: nph\nvsb: mnf ftr dhc ggx\ndzs: bbf jjz nmf bjf\nmzz: nqm nnp\ndtd: jck gls\nmdx: hqx rqp\nssl: sjd lfc nmz\nlgb: pcf vtc mhc hld\nfxm: nld fck xxv\nqkt: xmp smt ndn hrj\nltb: vpt klf\nrdp: tzj sxh ncs dbz\nxgf: knr\nrdk: nlq\nvzp: fnx gpf nbg jpr\npqp: zkp mzr\nxzf: hpr lsz rtz cpk kjc nnl psd rdg\nbrx: pjg\nkqs: qgh trd\nxnb: jcn qcp\nskp: dms\nnrs: trf xvv\nsmc: jsv\nrvx: plm vhd gnv\ndjr: msz dms qxt\nrbm: lhz grx chp\nlsz: dmp ltc\ncjh: hpg bqv rdg\nqmf: zgn pnr lvp\nxgj: zjz nlf szh hfm hkd\ncbg: fkl kqh\nxtf: krm ncr\njkt: jfv\nmhl: qvx bmg vkn\nrll: fdb\nqpv: kbt xkk\ntjq: nlm vgh dmg\nndq: pgv\nhxc: clp tzx jvb\nhhs: ztz klq jpf\ndhc: lqb kqd crq\njbr: ksz qmf mtj\nzgx: rxx jjz sqb\nvzq: rhc sdj\nsvb: gzm\nfgk: gcd lnz\nstq: flp cqb fnv hhg\nvdh: xjk rcb klf\nvnc: rgj vsc gmt\nckh: nth nsz jxk sss jzb\nvtl: kfm vms nrg\ndxp: mdg xgh mfh spt\npjc: vmf gkx hcs xjk\nlpm: dlm ptx mrr jpg\nvgh: cbh jfv ndq\nhhz: btc vlf xzj lbl\nsvt: mpb\nmmh: gls\njkm: vpq nbh\ndvj: fjc svn qbh jlx\nrpn: jsv rcq grb\nltc: mdg zpp gxh\nhrq: flx xcg zkt ldn\nqqf: clp bzl\nrxd: fdq\nfgh: sjd rkz zth\ntgp: kqd\nvmq: gbh vsz dvt lnv\npmc: cfv gkv chs fmn\nhft: dhg zcx dvt\nksh: bqm smk vqh bmx\nblr: scc cfv qdr\nrcq: tch\nlnn: qns fss\nzvl: xmp dbp hfp\nlpr: dms gmt klf"
	val input1 = "jqt: rhn xhk nvd\nrsh: frs pzl lsr\nxhk: hfx\ncmg: qnr nvd lhk bvb\nrhn: xhk bvb hfx\nbvb: xhk hfx\npzl: lsr hfx nvd\nqnr: nvd\nntq: jqt hfx bvb xhk\nnvd: lhk\nlsr: lhk\nrzs: qnr cmg lsr rsh\nfrs: qnr lhk lsr"

	def main(args: Array[String]): Unit = {
		val lines = input.split("\\\n").toList
		val graph = parseGraph(lines)

		val t = System.currentTimeMillis()
		graph.print()
		graph.findConnectivity()
		var merged = graph.karger
		var links = merged.edges.size/2
		var best = links
		var n = 1
		println(links)
		while (links>3) {
			merged = graph.karger
			links = merged.edges.size/2
			if (links<best) {
				best = links
				println(links)
			}
			n+=1
		}
		println(n+" iterations were required")
		merged.print()
		println("Links: "+links+", node sizes = "+merged.nodes.map(merged.nodeSize).mkString(" "))
		println()
		println((System.currentTimeMillis()-t)+"ms")
	}

	def parseGraph(lines: List[String]): Graph = {
		val edges = lines.map(parseLine).flatten
		val nodes = edges.map(_._1).toSet
		Graph(nodes, edges)
	}

	def parseLine(line: String): List[(String,String)] = {
		val s"$name: $conns" = line
		val connList = tokens(conns)
		connList.map(Tuple2(name,_))++connList.map(Tuple2(_,name))
	}

	val rand = new Random()

	case class Graph(nodes: Set[String], edges: List[(String,String)]) {
		def print(): Unit = {
			for (node <- nodes.toList.sorted)
				println(node+" -> "+edges.filter(_._1==node).map(_._2).mkString(" "))
			println(nodes.size)
			println()
		}
		def nodeSize(node: String): Int = 1+node.count(_=='-')
		def merge(a: String, b: String) = {
			val old = Set(a,b)
			val merged = a+"-"+b
			val newNodes = nodes-a-b+merged
			val newEdges = edges.filter(p=> !(old(p._1) && old(p._2))).
				map(p=> if (old(p._1)) (merged,p._2) else if (old(p._2)) (p._1, merged) else p)
			Graph(newNodes, newEdges)
		}

		def karger: Graph = {
			if (nodes.size<=2) this
			else {
				val n = rand.nextInt(edges.size)
				val edge = edges(n)
				merge(edge._1, edge._2).karger
			}
		}

		var connectivity = Map[(String,String), Int]()
		def findConnectivity() = {
			val quickLinks: Map[String,List[String]] = nodes.map(n=> (n, edges.filter(_._1==n).map(_._2))).toMap
			def countUniquePaths(from: String, to: String): Int = {
				var remaining = nodes-from
				var c = 0

				def findShortest(frontier: Set[String], visited: Map[String,String]): List[String] = {
					def recoverPath(n: String): List[String] = {
						if (n==from) List(n)
						else n::recoverPath(visited(n))
					}
					if (visited.contains(to)) recoverPath(visited(to))
					else {
						var newFrontier = Set[String]()
						var newVisited = visited
						for (n <- frontier) {
							val next = quickLinks(n).filter(remaining).filter(!visited.contains(_))
							newVisited++= next.map(Tuple2(_,n))
							newFrontier++= next
						}
						if (newFrontier.isEmpty) Nil
						else findShortest(newFrontier, newVisited)
					}
				}

				var startingFrontier = quickLinks(from).toSet
				if (startingFrontier.contains(to)) {
					c+= 1
					startingFrontier = startingFrontier-to
				}
				while (remaining.nonEmpty) {
					val frontier = startingFrontier.filter(remaining)
					val path = findShortest(frontier, frontier.map(Tuple2(_,from)).toMap)
					if (path.isEmpty)
						return c
					else {
						remaining = remaining--path
						c+= 1
					}
				}
				c
			}

			for (n1 <- nodes) {
				for (n2 <- nodes-n1)
					connectivity+= (n1,n2) -> countUniquePaths(n1,n2)
			}
			val min = connectivity.values.min
			connectivity.filter(_._2==min).foreach(println)
		}
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}