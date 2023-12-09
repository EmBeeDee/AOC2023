package net.snowtiger.aoc

/**
 * @author mark
 */

object AOC8
{
	val input = "RL\n\nAAA = (BBB, CCC)\nBBB = (DDD, EEE)\nCCC = (ZZZ, GGG)\nDDD = (DDD, DDD)\nEEE = (EEE, EEE)\nGGG = (GGG, GGG)\nZZZ = (ZZZ, ZZZ)"
	val input1 = "LLR\n\nAAA = (BBB, BBB)\nBBB = (AAA, ZZZ)\nZZZ = (ZZZ, ZZZ)"
	val input2 = "LRRLRRRLRRRLLRRLRRLRLRLRRLLRRLRRLRRRLLLRRRLRRRLRRRLLRRRLRRLLRRLRRLRLRRRLRRLRLRRLRRRLLRRLLRLRRRLLRRLRRLLLRLRRRLRLRLRLLRRRLRLLRRRLRLRRRLRRRLLRRLRRRLLRRLRLLRLRRLLLRRLRRLLLRLLRLRRRLRLRLRRRLRRLLRRRLRLRLRRLRRRLRLRRLRRLRRRLRRRLRRRLRRRLRRLLRRLRLLRRLLRRRLRLLRLRLRRLRRLRLRLRRRLRLRLRRLRLRRLRRRR\n\nFPF = (PTN, MPT)\nDGM = (KXM, PRM)\nFKB = (JLC, MBX)\nXCJ = (DCJ, TSH)\nJVH = (VCH, SMV)\nBXL = (HLB, NVF)\nGVD = (FSQ, MFD)\nCDJ = (SMM, HHS)\nBGM = (FHB, LKH)\nFBP = (HHS, SMM)\nLTK = (TCV, GQX)\nLDM = (MRM, JKJ)\nRDK = (KBL, GHP)\nBJB = (XBN, BXG)\nKST = (BGX, VFS)\nVKM = (MFR, CJP)\nCSG = (GGJ, JHH)\nJFS = (QCG, XFR)\nMDV = (FPQ, NRX)\nQHF = (PJP, QHX)\nDHM = (LJC, PDS)\nMMV = (CHS, FXX)\nCQP = (LFN, GSD)\nRDT = (NVG, NVG)\nXFN = (HFM, LTK)\nMFD = (RKJ, XGN)\nDTD = (JBV, JBV)\nKJG = (PCC, PPR)\nGLH = (JRN, BLK)\nKBV = (MCQ, MCS)\nLQF = (KDR, GFC)\nGGB = (JGL, RRM)\nBQX = (QKQ, NSG)\nSVS = (SQL, FXL)\nGMC = (BHG, GPC)\nKPZ = (HLV, RVH)\nRQB = (TDV, XPN)\nGVR = (SXD, QRB)\nMNX = (DLT, CMJ)\nQDM = (TKN, VDH)\nCCB = (KPR, QCK)\nBVF = (QJX, FKK)\nTJB = (HKV, BCP)\nBHC = (SSN, HHH)\nNTN = (RPT, PVF)\nNDP = (BJQ, MGH)\nPJP = (NTN, FSR)\nBLL = (MTQ, SNQ)\nRNP = (RTD, PGM)\nPVF = (BMP, LPM)\nQFL = (NNS, GLR)\nVRG = (GGV, DMG)\nXRX = (TTR, LXS)\nMBH = (RHX, GKF)\nCXD = (LFN, GSD)\nFFK = (LDG, VHS)\nNHM = (BLM, XQD)\nTNB = (KSS, FSB)\nVLX = (KCF, VXL)\nDDF = (TNK, FBS)\nGQR = (BGM, MGR)\nBPQ = (FHD, MJT)\nKPR = (SDL, NMQ)\nCNL = (QFP, XPV)\nHVA = (BRQ, XPL)\nPHF = (LHF, HVR)\nTNZ = (XCM, BFL)\nNDJ = (GCQ, RTL)\nHCT = (PQT, VVB)\nJNH = (GVV, JMC)\nCNV = (SDP, NQR)\nGGV = (RHT, SLG)\nPRX = (FSD, KST)\nBLM = (KKQ, CSG)\nJRN = (GGK, GBF)\nDJK = (GQJ, JKB)\nRVH = (FXJ, JVN)\nRXF = (CHG, GDT)\nMBX = (KJM, XFN)\nHLV = (JVN, FXJ)\nXDG = (HJM, KCT)\nLPM = (RCG, RHG)\nGLP = (XDM, XNC)\nHQP = (JXQ, XPT)\nCXF = (SCV, PHF)\nQJT = (FJN, GHV)\nMPL = (HSQ, FKN)\nSDP = (LCQ, GRV)\nCDQ = (JLV, LLD)\nHHA = (BFL, XCM)\nGPS = (VLX, CPL)\nBXZ = (KSN, VKP)\nPGM = (LJV, CDQ)\nPKG = (VQF, FXC)\nXPL = (LBN, DMV)\nBJJ = (TVV, MNX)\nHLB = (SNN, HNH)\nCDV = (TNB, FSN)\nFXC = (CLF, HSC)\nJFM = (LSR, CNL)\nCMV = (DHQ, DJR)\nLDN = (BCQ, JMS)\nXNC = (JLS, KXS)\nSNN = (NGM, MFJ)\nCND = (RDL, GJJ)\nSKT = (FCM, MRC)\nQRB = (BCG, HRR)\nXNK = (LJC, PDS)\nDGK = (KBF, SRB)\nLNL = (FSD, KST)\nPCM = (PDL, JFS)\nBSV = (LSR, CNL)\nSMX = (TKL, QPF)\nXMS = (MDB, PKP)\nXPT = (LDM, PKV)\nRLB = (XFT, PKM)\nVVV = (NRX, FPQ)\nMGB = (LNN, NKR)\nSFJ = (LFT, QDM)\nMFX = (GLP, RPN)\nDLX = (SQQ, NHM)\nXQC = (HQJ, NPC)\nGHF = (VNG, TGQ)\nLRX = (GDT, CHG)\nSHV = (SRM, DVJ)\nTQS = (PRD, HGV)\nSQK = (QNB, PSJ)\nCHS = (MXK, GCR)\nVDH = (FMX, XMR)\nDGN = (LGT, PNQ)\nRMM = (CFK, RQD)\nRQK = (FSN, TNB)\nSLH = (BDS, BBP)\nHVR = (NTS, NQG)\nPSJ = (JFK, XXM)\nGBD = (VMR, KJG)\nFRH = (MNX, TVV)\nTHH = (GHF, MNF)\nXTP = (VPC, BQQ)\nVMR = (PCC, PPR)\nPPQ = (GJJ, RDL)\nVHK = (TXT, DDN)\nJCG = (CCD, BXL)\nLCQ = (MPF, NDP)\nKCR = (PFH, DJK)\nLHL = (LGL, KCR)\nJMC = (RBG, CGH)\nJPM = (XMS, CVR)\nCLF = (HDT, DHR)\nFSQ = (XGN, RKJ)\nDVJ = (VHD, XNM)\nKCT = (SKT, QLK)\nXFD = (HXR, JVH)\nBVA = (GPT, RSD)\nMGR = (FHB, LKH)\nPXV = (MJJ, VBK)\nFNG = (TQS, HHM)\nGFD = (XRG, JCS)\nSST = (PHP, JGC)\nKJV = (DMG, GGV)\nPQM = (TTX, RMM)\nXRT = (KBL, GHP)\nJLV = (NKV, BLL)\nFKS = (CBR, RLJ)\nHMD = (JNH, GXG)\nFRL = (KQX, DDB)\nTRP = (LXT, HMC)\nTNK = (FRN, FRN)\nKDR = (PRX, LNL)\nXTS = (NDJ, HFB)\nHVM = (FMG, FHN)\nCHH = (TMD, MNM)\nHHM = (PRD, HGV)\nPJC = (FCC, VJD)\nTSH = (RPR, CVJ)\nGGJ = (NFK, NXD)\nDMG = (RHT, SLG)\nQPT = (QFL, PFN)\nDDN = (RHP, NSS)\nXHJ = (BPQ, CSM)\nNNM = (KHG, SRF)\nLFL = (TMN, JCG)\nNKV = (SNQ, MTQ)\nTMH = (LGT, PNQ)\nCCD = (HLB, NVF)\nGSD = (MRB, TFS)\nRHG = (VXH, MXS)\nLFT = (TKN, VDH)\nBJV = (DST, PTK)\nCGD = (PKG, ZZZ)\nVNG = (BJV, HDX)\nHJS = (GPC, BHG)\nFRN = (VKP, KSN)\nMRC = (JKK, CMV)\nBQQ = (NBF, PJC)\nKSN = (FNJ, GVR)\nQNB = (XXM, JFK)\nRSC = (JCB, JCB)\nGCQ = (XGH, FKB)\nSHS = (JBV, DDF)\nLLR = (XHJ, PGB)\nRSA = (RVH, HLV)\nDMX = (GSH, SST)\nHRD = (HLK, DJG)\nLHF = (NTS, NQG)\nJMS = (FKS, HPB)\nSRB = (SRG, GSF)\nLHN = (HLK, DJG)\nDTM = (RXM, VHK)\nPNP = (SNC, LPF)\nMPF = (BJQ, BJQ)\nSCV = (LHF, HVR)\nBTV = (GLH, PNN)\nNJG = (RXK, NXB)\nNGM = (THG, TXQ)\nFXL = (XRX, MBV)\nNHJ = (DSX, NNM)\nRBG = (DGK, LFQ)\nHGV = (HTS, RNP)\nLDF = (KRB, NXC)\nPMR = (GNH, CHQ)\nDVM = (MNM, TMD)\nFBS = (FRN, BXZ)\nBMM = (XSK, DDK)\nGGK = (MXH, JNG)\nNXB = (LHN, HRD)\nPNN = (JRN, BLK)\nPSV = (LLR, KXX)\nKGK = (TJP, QMM)\nCVG = (VLX, CPL)\nQNF = (XPB, PCM)\nHTS = (PGM, RTD)\nFJN = (DTD, SHS)\nJXB = (CLX, KPZ)\nDLT = (JGH, SFD)\nSFV = (HJM, KCT)\nGSF = (DLX, CHL)\nTKN = (XMR, FMX)\nLJB = (QJT, FVJ)\nQFP = (NXL, DGP)\nPKV = (JKJ, MRM)\nRHX = (RDK, XRT)\nKDP = (FKN, HSQ)\nRLJ = (BGF, JRP)\nVQR = (FDK, RLB)\nXNX = (HGQ, HGQ)\nDSX = (KHG, SRF)\nPDS = (VQK, KNJ)\nGKX = (TKL, QPF)\nCHQ = (XSM, HMD)\nKXX = (XHJ, PGB)\nMDB = (VVV, MDV)\nBCG = (XJX, SQK)\nKJM = (LTK, HFM)\nHRR = (SQK, XJX)\nGXD = (JFM, BSV)\nSCR = (JDN, QRS)\nGMK = (FPF, CTM)\nKXM = (PDJ, MFX)\nDKQ = (GCL, QFN)\nDJR = (FGV, PSV)\nGQX = (DFL, LQF)\nPTK = (TRS, TMC)\nBLK = (GGK, GBF)\nRSD = (XDG, SFV)\nSVT = (PXV, XCL)\nXFT = (BJJ, FRH)\nLSR = (XPV, QFP)\nBCP = (NMB, NXM)\nKGP = (RDT, FNB)\nDHF = (PNN, GLH)\nJHH = (NXD, NFK)\nDGP = (GKX, SMX)\nKSK = (DKP, RXT)\nKRM = (PQM, DCK)\nXJX = (QNB, PSJ)\nJKK = (DJR, DHQ)\nCFK = (DGN, TMH)\nPSS = (HNP, STL)\nMFR = (PMR, RJS)\nJNG = (TQQ, HXB)\nMDG = (VCC, HTF)\nVCC = (DGM, MKH)\nTQQ = (FCQ, SCR)\nDMK = (GXD, GFF)\nGHV = (DTD, SHS)\nHLP = (NNH, TQN)\nBGK = (QHJ, BQX)\nVKN = (DPT, FNG)\nSTL = (DPP, NMX)\nQFS = (MGR, BGM)\nHSC = (DHR, HDT)\nFPQ = (NSL, RQN)\nQMM = (CDJ, FBP)\nPDL = (XFR, QCG)\nPDJ = (GLP, RPN)\nFSD = (VFS, BGX)\nMPT = (DKQ, RSQ)\nMHQ = (NTL, TKG)\nMPC = (NQJ, NQJ)\nDST = (TRS, TMC)\nKHD = (CLX, CLX)\nBNT = (MFR, CJP)\nVJD = (GPS, CVG)\nDLG = (JCS, XRG)\nMCD = (CHH, DVM)\nVSG = (XPR, TVQ)\nMSX = (VQR, KXQ)\nVMV = (VQR, KXQ)\nQCG = (NHJ, NMH)\nRPN = (XNC, XDM)\nNVG = (RSC, RSC)\nGDT = (LDC, QPT)\nGMX = (RJX, VRM)\nRDL = (MBH, NTF)\nXXM = (JSC, MHQ)\nSRF = (BGK, NQF)\nXNM = (SGJ, XCJ)\nRPT = (LPM, BMP)\nGPT = (SFV, XDG)\nJCB = (BFL, XCM)\nQKQ = (FRL, GGT)\nMTQ = (LQB, XPG)\nCHG = (QPT, LDC)\nFMS = (FJX, GMX)\nMBV = (LXS, TTR)\nJFP = (XPN, TDV)\nJFJ = (HNP, STL)\nGKF = (RDK, XRT)\nLDK = (QCT, TVX)\nCLX = (RVH, HLV)\nTXQ = (DFR, KQF)\nXGH = (MBX, JLC)\nKFB = (SHV, MRV)\nRSV = (GSX, TPK)\nNKR = (KFB, TFN)\nFCQ = (JDN, QRS)\nRQN = (TLC, GFQ)\nFSN = (FSB, KSS)\nQDQ = (VBQ, GSM)\nFFC = (DKC, DMK)\nKBC = (BHQ, TRP)\nPHB = (VCC, HTF)\nGBH = (FFC, CGL)\nTTR = (KBV, LJP)\nMRB = (DHG, QNF)\nSDL = (PSS, JFJ)\nTMC = (BXK, RSV)\nLXT = (GGB, MDT)\nLQB = (BNT, VKM)\nRXT = (GBH, SSD)\nSSN = (CRH, XTP)\nMRV = (SRM, DVJ)\nFJX = (RJX, VRM)\nFQB = (MNF, GHF)\nDKC = (GFF, GXD)\nMGQ = (LDK, RVG)\nDLK = (FPF, CTM)\nFHN = (HKK, BVF)\nBFL = (LJG, XQM)\nPKP = (VVV, MDV)\nQHJ = (QKQ, NSG)\nBCQ = (HPB, FKS)\nLDG = (VMV, MSX)\nBFH = (RXT, DKP)\nXPB = (JFS, PDL)\nHDX = (PTK, DST)\nNQF = (BQX, QHJ)\nDPT = (TQS, HHM)\nDCK = (TTX, RMM)\nNPC = (KGP, QJG)\nBCD = (NXB, RXK)\nHDT = (HPM, FTQ)\nFHD = (XNK, DHM)\nNNS = (XFD, MBT)\nGSX = (VRG, KJV)\nBXG = (BFH, KSK)\nVVB = (QDQ, JXC)\nNVF = (HNH, SNN)\nKRB = (JBH, JNJ)\nFXX = (GCR, MXK)\nJXQ = (LDM, PKV)\nMTT = (DLG, GFD)\nHXR = (VCH, SMV)\nMNM = (SPQ, PNP)\nQJG = (RDT, FNB)\nJLS = (KRM, LBQ)\nCJK = (TJB, VDD)\nTXT = (RHP, NSS)\nFXT = (JMS, BCQ)\nNSS = (LRX, RXF)\nVJQ = (RSC, MXR)\nXXH = (LNN, NKR)\nNSL = (GFQ, TLC)\nXSM = (GXG, JNH)\nHFM = (TCV, GQX)\nJGC = (NDL, JPM)\nHGQ = (GPT, RSD)\nCHL = (SQQ, NHM)\nVBK = (GKG, XTS)\nMBT = (HXR, JVH)\nFNJ = (SXD, QRB)\nJBH = (HCT, SGG)\nJRP = (FXP, VKN)\nVRM = (MPC, GQP)\nBBP = (JCL, LDF)\nGXH = (RXM, VHK)\nMXR = (JCB, TNZ)\nBSD = (CCP, GBD)\nQFN = (MPL, KDP)\nLNN = (TFN, KFB)\nSQQ = (BLM, XQD)\nMJT = (XNK, DHM)\nGSH = (JGC, PHP)\nPQT = (JXC, QDQ)\nRVG = (QCT, TVX)\nDHG = (PCM, XPB)\nLKJ = (HQP, HHG)\nXHB = (SJL, DMX)\nGKG = (HFB, NDJ)\nPGB = (BPQ, CSM)\nVBQ = (CVS, QHF)\nJXC = (GSM, VBQ)\nQCK = (SDL, NMQ)\nPFN = (NNS, GLR)\nRXK = (LHN, HRD)\nBVX = (GMK, DLK)\nLPF = (MMV, LQK)\nSMM = (SFJ, KGR)\nSJL = (SST, GSH)\nHMC = (MDT, GGB)\nVQF = (CLF, HSC)\nNRX = (RQN, NSL)\nCBR = (JRP, BGF)\nJLC = (KJM, XFN)\nTMD = (SPQ, PNP)\nHXB = (FCQ, SCR)\nSBQ = (SQV, NCH)\nLGT = (MGB, XXH)\nHSF = (TJB, VDD)\nJBS = (MGQ, NVQ)\nDKP = (SSD, GBH)\nHSQ = (SVT, LKV)\nGPC = (HVM, TGC)\nTVV = (DLT, CMJ)\nBHG = (TGC, HVM)\nCGR = (LDN, FXT)\nPFH = (GQJ, GQJ)\nFCM = (JKK, CMV)\nRRM = (KJP, BMM)\nFCG = (MDG, PHB)\nMCS = (HLP, DNV)\nBXK = (GSX, TPK)\nVQK = (HJS, GMC)\nLDH = (XPR, TVQ)\nDXN = (GMK, DLK)\nGFQ = (RQB, JFP)\nPKK = (BBP, BDS)\nBBR = (FXT, LDN)\nBJQ = (KHD, KHD)\nRCG = (MXS, VXH)\nHPM = (KJF, CXF)\nQJX = (CDV, RQK)\nNMB = (RKC, GVD)\nJCL = (KRB, NXC)\nGXM = (BBR, CGR)\nNMX = (XNX, SQP)\nNXM = (RKC, GVD)\nQMT = (MDG, PHB)\nDMV = (LTG, SBQ)\nFTQ = (KJF, CXF)\nTCV = (DFL, LQF)\nMFJ = (TXQ, THG)\nVKP = (FNJ, GVR)\nXQD = (CSG, KKQ)\nSRM = (VHD, XNM)\nSLG = (LRJ, JFL)\nJCS = (CQP, CXD)\nLJP = (MCQ, MCS)\nNBF = (FCC, VJD)\nDFL = (KDR, GFC)\nNFM = (XBN, BXG)\nCMR = (PKG, PKG)\nJVN = (XHB, MCC)\nRKC = (FSQ, MFD)\nJKJ = (BSQ, LJB)\nBGX = (MMD, FMS)\nTHG = (KQF, DFR)\nRKJ = (CVN, FFK)\nLQK = (CHS, FXX)\nCPL = (VXL, KCF)\nJSC = (TKG, NTL)\nDNV = (TQN, NNH)\nLFF = (HQJ, NPC)\nTVQ = (SSF, GXM)\nNQR = (LCQ, GRV)\nTMN = (BXL, CCD)\nXDM = (KXS, JLS)\nCJP = (RJS, PMR)\nHKV = (NMB, NXM)\nSPQ = (SNC, LPF)\nHQJ = (KGP, QJG)\nGXG = (JMC, GVV)\nKSS = (CND, PPQ)\nLJG = (DTM, GXH)\nBHQ = (HMC, LXT)\nFGV = (KXX, LLR)\nKCF = (LKJ, NTJ)\nPRM = (MFX, PDJ)\nQKD = (FXL, SQL)\nDDB = (CSB, MCD)\nVHH = (CMR, CGD)\nLLM = (BVX, DXN)\nPTN = (RSQ, DKQ)\nGSM = (CVS, QHF)\nCVN = (VHS, LDG)\nRHT = (LRJ, JFL)\nJFK = (JSC, MHQ)\nNTS = (QFS, GQR)\nTQN = (DHF, BTV)\nKHG = (BGK, NQF)\nZZZ = (FXC, VQF)\nVXL = (NTJ, LKJ)\nVFS = (MMD, FMS)\nLBQ = (PQM, DCK)\nKQX = (CSB, MCD)\nFDK = (XFT, PKM)\nNQG = (GQR, QFS)\nKXS = (LBQ, KRM)\nJDN = (HDL, CCB)\nTKL = (HSF, CJK)\nXRG = (CQP, CXD)\nBMP = (RCG, RHG)\nKQF = (KGK, LGN)\nHLK = (MTT, PFT)\nNFK = (MRS, CNV)\nHNH = (MFJ, NGM)\nFKN = (SVT, LKV)\nVPC = (PJC, NBF)\nDDK = (SVS, QKD)\nDCJ = (RPR, CVJ)\nNQJ = (CMR, CMR)\nLGL = (PFH, PFH)\nRTD = (CDQ, LJV)\nFVJ = (FJN, GHV)\nBDS = (LDF, JCL)\nNSG = (GGT, FRL)\nRXM = (DDN, TXT)\nJNJ = (SGG, HCT)\nSRG = (DLX, CHL)\nTGC = (FMG, FHN)\nFMG = (BVF, HKK)\nNTJ = (HHG, HQP)\nKNJ = (HJS, GMC)\nQJB = (CCP, GBD)\nNXL = (SMX, GKX)\nVHS = (MSX, VMV)\nCRH = (BQQ, VPC)\nGFF = (JFM, BSV)\nGLR = (XFD, MBT)\nXPR = (GXM, SSF)\nLLD = (BLL, NKV)\nKXQ = (FDK, RLB)\nMXH = (TQQ, HXB)\nRQD = (DGN, TMH)\nFNB = (NVG, VJQ)\nMGH = (KHD, JXB)\nJGL = (BMM, KJP)\nKJF = (SCV, PHF)\nSXD = (BCG, HRR)\nTPK = (KJV, VRG)\nTJP = (FBP, CDJ)\nMKH = (KXM, PRM)\nHJM = (SKT, QLK)\nGHP = (RFL, KBC)\nLGN = (TJP, QMM)\nLJV = (JLV, LLD)\nNXD = (CNV, MRS)\nLKH = (LLM, BNK)\nCTM = (MPT, PTN)\nSNC = (LQK, MMV)\nPNQ = (XXH, MGB)\nFMX = (BSD, QJB)\nQQL = (HHH, SSN)\nQLK = (FCM, MRC)\nCMJ = (JGH, SFD)\nFHB = (BNK, LLM)\nTKG = (FQB, THH)\nXPV = (DGP, NXL)\nRHP = (LRX, RXF)\nBRQ = (LBN, DMV)\nNDL = (XMS, CVR)\nLDC = (PFN, QFL)\nDPP = (XNX, XNX)\nNMQ = (PSS, JFJ)\nSGG = (PQT, VVB)\nFSR = (RPT, PVF)\nAAA = (VQF, FXC)\nJFL = (BJB, NFM)\nXFR = (NHJ, NMH)\nHHS = (SFJ, KGR)\nMLZ = (RSD, GPT)\nMNF = (VNG, TGQ)\nFXP = (DPT, FNG)\nMRS = (SDP, NQR)\nMDT = (JGL, RRM)\nMJJ = (GKG, XTS)\nPFT = (GFD, DLG)\nTVX = (BCD, NJG)\nNPA = (VKP, KSN)\nTDV = (LDH, VSG)\nGQJ = (PDM, PDM)\nNTF = (GKF, RHX)\nGGT = (KQX, DDB)\nLFN = (TFS, MRB)\nCSM = (MJT, FHD)\nNVQ = (RVG, LDK)\nPKM = (FRH, BJJ)\nPDM = (BRQ, XPL)\nJGH = (BHC, QQL)\nSSF = (CGR, BBR)\nGVV = (CGH, RBG)\nFSB = (PPQ, CND)\nLKV = (XCL, PXV)\nMXK = (SLH, PKK)\nSQL = (XRX, MBV)\nLRJ = (BJB, NFM)\nVXH = (LFF, XQC)\nHTF = (MKH, DGM)\nCTB = (LGL, KCR)\nHFB = (RTL, GCQ)\nNTL = (FQB, THH)\nSFD = (QQL, BHC)\nHNP = (DPP, DPP)\nTTX = (RQD, CFK)\nMCQ = (HLP, DNV)\nCCP = (VMR, KJG)\nTFN = (MRV, SHV)\nJKB = (PDM, RFZ)\nTGQ = (BJV, HDX)\nPHP = (JPM, NDL)\nRJX = (MPC, GQP)\nCVJ = (LFL, KLG)\nKJP = (DDK, XSK)\nQPF = (HSF, CJK)\nSNQ = (XPG, LQB)\nBGF = (VKN, FXP)\nKLG = (TMN, JCG)\nCGL = (DMK, DKC)\nXCM = (XQM, LJG)\nRPR = (LFL, KLG)\nLFQ = (KBF, SRB)\nRJS = (CHQ, GNH)\nHDL = (KPR, QCK)\nFXJ = (MCC, XHB)\nXPG = (VKM, BNT)\nDHQ = (FGV, PSV)\nSQV = (QMT, FCG)\nDHR = (FTQ, HPM)\nFCC = (GPS, CVG)\nNCH = (FCG, QMT)\nQRS = (HDL, CCB)\nXQM = (GXH, DTM)\nSGJ = (TSH, DCJ)\nKBL = (RFL, KBC)\nNXC = (JBH, JNJ)\nBSQ = (QJT, FVJ)\nLTG = (NCH, SQV)\nSMV = (JBS, MDQ)\nGJJ = (MBH, NTF)\nGRV = (MPF, NDP)\nHPB = (RLJ, CBR)\nTRS = (BXK, RSV)\nGCR = (SLH, PKK)\nHHH = (CRH, XTP)\nGNH = (XSM, HMD)\nRSQ = (QFN, GCL)\nHKK = (QJX, FKK)\nJBV = (TNK, TNK)\nTFS = (DHG, QNF)\nRTL = (FKB, XGH)\nHHG = (XPT, JXQ)\nPPR = (LHL, CTB)\nSQP = (HGQ, MLZ)\nXBN = (BFH, KSK)\nCVR = (MDB, PKP)\nRFL = (BHQ, TRP)\nQHX = (FSR, NTN)\nVCH = (MDQ, JBS)\nGCL = (MPL, KDP)\nKKQ = (GGJ, JHH)\nGFC = (PRX, LNL)\nPRD = (HTS, RNP)\nGQP = (NQJ, VHH)\nLJC = (VQK, KNJ)\nQCT = (BCD, NJG)\nKBF = (SRG, GSF)\nNNH = (BTV, DHF)\nSSD = (CGL, FFC)\nVDD = (HKV, BCP)\nVHD = (XCJ, SGJ)\nRFZ = (XPL, BRQ)\nKGR = (LFT, QDM)\nMDQ = (NVQ, MGQ)\nMXS = (LFF, XQC)\nPCC = (LHL, CTB)\nTLC = (RQB, JFP)\nCVS = (PJP, QHX)\nBNK = (DXN, BVX)\nCSB = (CHH, DVM)\nXPN = (VSG, LDH)\nXSK = (SVS, QKD)\nLBN = (LTG, SBQ)\nFKK = (RQK, CDV)\nMCC = (SJL, DMX)\nNMH = (DSX, NNM)\nMMD = (GMX, FJX)\nLXS = (LJP, KBV)\nXMR = (QJB, BSD)\nDFR = (KGK, LGN)\nDJG = (PFT, MTT)\nCGH = (DGK, LFQ)\nMRM = (BSQ, LJB)\nXCL = (MJJ, VBK)\nGBF = (JNG, MXH)\nXGN = (FFK, CVN)"
	val input3 = "LR\n\n11A = (11B, XXX)\n11B = (XXX, 11Z)\n11Z = (11B, XXX)\n22A = (22B, XXX)\n22B = (22C, 22C)\n22C = (22Z, 22Z)\n22Z = (22B, 22B)\nXXX = (XXX, XXX)"

	val start = "AAA"
	val end = "ZZZ"

	def main(args: Array[String]): Unit =
	{
		val lines = input2.split('\n').toList
		val dm = extract(lines)
		dm.starts.foreach(s => println(dm.getCycles(s)))
		//val r = dm.followPt2
		//println(r)
	}

	def extract(lines: List[String]): DesertMap = {
		val d = lines.head
		val map = lines.tail.tail.map(extract).toMap
		DesertMap(d, map)
	}

	def extract(line: String): (String, (String,String)) = {
		val s"$from = ($left, $right)" = line
		(from, (left, right))
	}

	case class DesertMap(directions: String, maps: Map[String, (String,String)]) {
		def starts = maps.keys.toList.filter(_.endsWith("A"))

		def followPt2: Long = {
			var d = directions
			var curr = starts
			var n = 0
			while (!curr.forall(_.endsWith("Z"))) {
				n+= 1
				if (d.isEmpty) d = directions
				curr = curr.map(c=> next(c, d.head))
				d = d.tail
				//println(curr)
			}
			n
		}

		def getCycles(from: String): List[Int] = {
			var d = directions
			var curr = from
			var cyc = List[Int]()
			var n = 0
			var seen = Set[(String,String)]()
			while (!seen(Tuple2(curr,d))) {
				seen+= Tuple2(curr,d)
				if (curr.endsWith("Z")) cyc = n::cyc
				if (d.isEmpty) d = directions
				curr = next(curr, d.head)
				d = d.tail
				n+= 1
			}
			cyc.reverse
		}

		def follow: Long = {
			var d = directions
			var curr = start
			var n = 0
			while (curr!=end) {
				n+= 1
				if (d.isEmpty) d = directions
				curr = next(curr, d.head)
				d = d.tail
				println(curr)
			}
			n
		}

		def next(curr: String, d: Char) = {
			val p = maps(curr)
			if (d=='L') p._1 else p._2
		}

	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}