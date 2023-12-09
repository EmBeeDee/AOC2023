package net.snowtiger.aoc

/**
 * @author mark
 */

object AOC7
{
	val input = "32T3K 765\nT55J5 684\nKK677 28\nKTJJT 220\nQQQJA 483"
	val input1 = "77776 507\n26J35 214\n9999Q 314\n3JKQK 630\nAA77K 94\n55A55 372\n925J4 622\n788T2 783\nA6A9A 763\nK588K 2\nKA6JA 601\n22KQ7 574\n59T95 281\n4K973 658\nA7TJT 413\n6K2J2 859\nKAKAK 528\n84ATT 657\nT4792 376\n57J6Q 414\n23Q2Q 466\n7TQQQ 718\n88588 858\n396A7 213\n93339 843\n3KKTK 221\nQQTQQ 323\nATT85 608\n2643K 989\nJ888J 439\nJ66J6 754\n95777 353\n497Q3 576\n77AKJ 829\n9KKK9 516\n55585 98\n3J3JQ 675\n87727 780\nJ6T2T 223\n5353A 826\n47TKJ 285\n6A66J 840\nKQKQQ 112\nJ2T2T 697\n7J268 172\n88J44 385\n468JQ 350\nA75JT 973\n6T69T 489\n4Q222 705\nT869K 173\n6T677 43\nQ7963 562\n6JA33 322\nJ7579 274\n4T9A6 455\nTT7T9 671\n226KK 679\n2KQQJ 957\nAJT9A 494\nQ55AT 365\n6Q33Q 201\n49KTA 293\n2257A 438\nJJJAA 116\nA6985 644\n2777A 397\nT6AJ5 912\n46TAJ 459\n77547 674\nJKKJK 779\n7Q324 998\n645J7 977\n34K2K 232\n8KA97 187\n55554 470\n5A66K 282\n88882 632\n75777 321\n94555 163\n478J8 967\n46264 884\nTTT7T 165\n3J8TT 828\n72868 915\n95K55 368\nAQ5T9 686\nJJ2AA 568\nAA7Q2 838\n77AJJ 896\n83333 345\n6T897 54\n337Q7 95\n29A99 317\n222QQ 539\n98534 359\n2J27J 834\nA5K5K 72\nQ5K57 641\n46744 307\n99J92 653\n534K9 706\n27J72 342\nT77T7 745\n6676J 635\n6TTTT 243\n44222 555\nA5T55 426\n29924 596\nQ8J96 683\nQK366 792\nJK542 146\nTKK68 302\n28T4J 817\n2Q2JQ 597\n444KQ 388\nK8838 20\n45AJ5 131\n3T3A3 869\n8J98K 577\n49K88 224\n2AAAA 719\n2222K 31\nJA255 194\nQQJ88 467\nTA33T 910\n96Q96 944\nQ7778 150\nAQ4JT 291\n43464 381\n72J85 448\n7J3A5 363\n3A53J 259\n5A5Q5 303\n3KKK9 935\nAA45Q 807\n66999 664\n4QKQQ 49\n282J5 6\nJ6JJ6 777\nT5TJ7 11\n344T7 184\n4QT3A 717\n67788 354\n9T6T9 360\n73773 17\n675Q4 225\nKK7KK 588\n66KKK 711\nJ5285 136\n72932 425\n99T9T 430\nTTTT2 920\n58858 9\n5K55K 749\n5T77T 147\n58333 325\n9T7JJ 79\n83J56 245\n4AJA4 250\n66296 708\n5K9K9 304\n3478A 526\nJQ828 769\nJ447Q 485\nATAAT 107\nT6A78 685\n45T9Q 386\nT9QTK 71\nQQ2QQ 73\n8T3J3 280\n43434 157\n37777 549\n846J8 586\n5A55J 444\nTA6T6 242\n88846 518\n253A7 500\nK2K22 349\n59T4J 809\nA6AAA 797\n9J2Q7 346\n55595 934\nA94JA 416\n666KA 129\nA4A24 271\nJ2722 278\n63336 92\nJK366 811\nAJA76 591\nQ8Q7Q 873\nAJA5T 853\nK5T6Q 599\nJ4AJ6 971\nT2TJT 390\nQJQ92 669\nT9T42 961\n8K98A 402\nTK936 923\nK83KJ 230\nJA99A 953\n8QQJJ 964\n75K37 24\nAJT22 398\n47675 695\nTJT55 737\nAJ56Q 514\n54J9K 212\nTTTJ7 446\nJ94J2 988\nKA42K 235\n5AQ45 696\n7K772 236\n3977K 435\n8596T 332\n99969 594\n3J84Q 721\n4678Q 729\nA55AA 445\n84T77 839\nA9QQ8 904\nTTT4T 498\nT9762 60\n79K24 678\nK7KA3 462\nJ5444 480\nQJ9Q5 289\n66KJ6 978\n55655 647\nAK9K8 930\n2T8AJ 623\nKJKKK 340\n55J58 370\n777K8 389\n28T2T 55\n66JKK 482\n5K3KK 99\n33393 384\nJ8443 151\n8AAAA 379\n79799 247\nTJ787 571\nA226K 472\n66KK6 367\nJ5762 453\n7K7K7 393\n3366K 355\nQQQ9Q 688\nAAK56 638\n3T53K 872\nTTTKQ 581\nA2A5J 210\n2A2KT 890\n62466 122\n4A5KA 724\n22662 521\n262JA 373\n3K37J 898\nJJAT8 7\n94646 643\n9Q38T 709\nJ9Q26 857\n44464 50\n66566 554\n7998K 774\n2KQ62 814\nQ4648 103\n2QJ22 690\n946Q6 411\n44A7J 557\n29A5K 931\n8J248 968\n99773 762\n483K7 962\n22242 567\n49999 527\n885JJ 297\nQ88J3 983\n28T44 195\n48544 909\nT4J2J 570\n545AA 864\n5333K 648\nKK677 566\n2244Q 100\n26229 142\nK5AT4 356\n3J56T 996\n2J655 645\n88Q8J 473\n88733 403\nT4JJK 895\nAA3J3 491\n8JQQ7 188\nAJAAA 652\nT6T64 479\n53363 589\nJQK2A 248\nA9986 324\nAKAAA 879\nK46QJ 41\nAT4AA 63\n557J9 318\n42989 155\n46785 741\nJ4TA2 37\nJAQQQ 620\n8KT8K 126\nQ928T 759\n5J557 714\n47JT9 991\nJ5AAA 756\nKJ27A 44\n8T598 747\n737K7 506\n48383 701\nK9J99 832\nTAK85 460\nQ83J2 358\n72QQ5 362\n6QQQ5 938\nQT9T9 5\n9A8K5 766\nQJTTQ 45\nJKK3T 933\nA5QAQ 419\n38TA9 299\n55TKT 703\n822K2 927\nAAAA7 357\n5TT9T 192\n9JAKT 56\n935Q7 650\nKK224 465\nTKJKT 208\n3TTTT 226\nQAJ6Q 913\n3T867 715\n3AT92 160\n77378 400\nA9QAJ 875\n88488 298\n2K8K8 452\nJJJJJ 90\nK383K 612\n7A368 326\n6JA2T 255\n22722 955\n5K85K 119\nAA7TT 477\n4J49T 320\nA9QK3 127\nAA5A7 375\n48579 605\n54465 975\n9494J 8\nKAA5A 883\nKT9T2 626\n74433 481\n47JQQ 534\n2222Q 541\n92K55 229\nJ8JT6 932\n4AAAJ 668\n3J222 167\n444TJ 614\n44449 217\nQ4982 629\n533J5 176\n937J5 504\n44997 108\nQ38TK 148\n49342 46\n9J98Q 659\n59A7Q 175\nKQ488 851\n66662 945\n75775 295\n96Q6Q 997\n44JK2 241\n929J2 531\nAJ82A 682\n66A45 694\n4T26Q 886\n63393 204\nJ3333 424\n99666 310\nTTJTT 341\n72J77 409\n8TTTJ 785\nTJ472 408\nTT333 240\n4A3J3 182\n3K6TJ 922\n5JQA2 816\nAA46A 806\n54397 881\n664J4 238\n98K88 976\nQ9345 768\nT4442 275\nK9995 76\n95K83 841\nK7496 940\n9899T 87\n93949 463\n9Q362 993\n6T576 509\n88AK8 14\n99J99 78\n4JT9J 263\n57755 970\nJ66K7 288\nTATTA 908\n577KQ 53\nAA33T 144\n444J7 950\n727A6 984\n2AT7K 517\nTTT22 128\n6J669 511\n5QA6K 929\n856J7 987\n953K7 947\n6628A 611\n9Q9Q9 82\nATTT8 860\n9K77K 819\n87558 469\n96A2A 124\n6466J 610\nA22J2 171\n77724 958\n959T8 52\nT48TT 573\n23Q82 710\n37393 617\n8878Q 96\n477A7 844\nQQQQ8 267\nQ27Q9 969\n5966T 980\nKK6TK 637\n57555 924\nJ826A 162\nJ5T5J 639\nA9K6J 156\n5525T 114\n8K79K 982\nJJJJ8 451\nT7625 26\n62222 395\nQQQ33 67\n22977 25\nTK349 556\n52222 450\n44994 575\n3K7K9 728\n77T65 906\n2JQQQ 572\n2K69K 347\n37K8T 137\n99399 776\nJAA66 663\n5266J 787\n96JJ9 692\nJA699 704\nK5K7K 132\n8J679 633\n3TJ68 732\n4TTTK 428\nT9J8K 928\n6J566 123\n38383 782\nQ5QQQ 40\n288TT 237\nT5555 475\n867T2 804\nJTKTQ 866\nAQT42 543\nA3647 894\n22666 405\n67757 74\n9A492 330\nAA444 621\nQQQ3Q 874\n2JJJ9 32\n43343 595\nQ7377 761\n449QQ 607\n9Q7TJ 429\n3Q294 911\nJ56K3 547\nKTTA6 348\n92A5Q 246\nJA3J8 12\nQQQQ4 164\nT24TT 478\n72T6K 598\n484QQ 265\n3KJT5 454\nK6A6A 535\n5JJ55 461\n5555J 770\nQQ3J3 283\nTA7A9 994\nKT3TJ 432\nQTQQT 846\nK3948 627\nJJ777 143\n8J376 565\nA7Q96 209\n78JQT 508\nAJTTQ 544\n9979T 251\n2AJKT 981\nT997T 139\nQ6QK7 748\nAT327 361\n97J7J 713\nAAA44 609\n9A43T 837\nJJ222 218\nK33K5 582\n38Q3J 152\n8QK45 186\n777Q7 672\nJ2792 887\nQKKQK 778\n677Q7 758\nKKK5K 744\n2255K 956\n53A55 233\n28966 765\n82Q88 29\nQ8A54 343\n9J7J2 104\n785K2 1\nTT2A5 946\n78592 488\nA3333 118\nQK264 538\nJ9QTQ 339\nAKA6A 284\nT539A 974\n99JTK 662\nJ8333 730\n93QT2 899\nAJJ9A 550\n87878 83\n46643 135\nAAAKK 130\nJ4KAK 651\n5748T 673\n96Q43 824\n8K88J 81\nK9566 185\nT44TT 38\n63T7J 311\n9J362 966\n33KJK 422\n77789 33\n8239T 661\n5639T 734\n9JKJ9 889\nTK8Q9 600\n45A7A 888\n96J98 110\nTJ9KT 279\n95999 992\n4J444 457\nJ5559 786\nAQK85 919\n29KTQ 69\n25223 781\nQ6235 585\n99398 262\n559A5 333\nQ9845 812\n4K58J 66\n445KK 590\nAA77A 27\nJ7977 753\n26526 10\n45AQ2 646\nQ83TT 371\nKKTKT 900\nK6KJK 750\nKKK43 583\n333T3 406\n4424A 290\nA882T 378\n44484 979\nQT3K3 986\nJ747K 960\n29K3T 447\n46465 707\n55J25 505\nAK2KA 788\n5TK3A 941\n3JT44 892\n44232 963\n5QJT7 77\n3AK85 926\nQTTQA 296\n783Q4 606\nQQQ99 624\n4JQAQ 551\n3KT28 228\n69A28 334\n77779 905\n5655T 312\n7A7A7 65\nAKAA8 524\nK4J4K 264\nK777J 698\nQQ6KJ 561\nA77J7 487\n4T77Q 443\n3QAJJ 468\nA49KJ 825\n45445 760\n6Q667 799\nJ8Q9Q 856\n5T5T2 689\n58TJ2 366\n2574A 580\nK43Q9 495\n9666K 15\nJQ4JK 738\n5J3J3 773\n6Q378 328\nJ2JTA 22\n28362 97\n8K3J4 616\nQQQQJ 105\n3K562 196\n34494 85\nK4823 954\nA4744 219\nK6TJ6 999\n73372 712\nT5TT7 227\nKKJ99 631\n6A6TA 959\n2J846 102\n95T9T 757\n73TTJ 421\n56566 640\n38388 316\n33AA3 854\n95K75 93\n8J488 415\n75K52 948\n4JJKK 292\n54883 560\n855Q5 990\n886K6 642\n32232 407\n96K9T 193\n54885 684\nAJQJQ 755\nTTJJT 39\n4QJKK 716\n9K4JK 423\n57522 810\nTA33J 937\nT2J23 863\nA46A6 30\nK888K 61\n67AT3 84\n47424 272\nJT5JA 166\nQ4KAA 893\n9Q368 731\n55TAA 273\nAA822 751\n55445 916\n8J777 313\n8T8TT 772\n8TTT2 300\n22455 972\n6QQQQ 723\n98885 19\nQKT4Q 519\n99T66 336\nJ7777 57\n443J4 337\nJA238 70\n65TQT 775\n9K65A 180\n5QK28 942\n7J82T 501\n7Q3T5 532\n8895J 211\nT737Q 437\n9336K 91\n2J757 699\nTT9TT 764\n8K9KK 191\n4AK4J 308\n44384 602\n77Q8J 159\n56T53 739\n22T5Q 499\nT7664 51\n66QQQ 925\nA9A9A 329\nAA33A 59\nKKKAJ 257\nKK8K7 113\nKKKK9 47\n33J37 503\n25T2T 902\nK59KK 121\n49T99 287\n4A69Q 625\nJK2J2 740\nJ34KK 338\nK5Q76 569\nAAAA5 75\nAJ4A8 28\nA68T6 464\nQ22QA 965\nKJ632 901\nJA572 391\n4TAK8 871\n3T57K 634\nA427J 855\n59J99 177\n52256 767\nKTKAA 133\n94593 294\n9AA99 676\n6JJ62 13\nT7323 80\n2KQ33 878\n44424 862\nA4646 301\n8888A 200\n55752 35\nJ93Q9 529\n8383A 120\nK5787 680\n2272Q 258\nKKJK3 510\n288J3 835\nKAA44 885\nT7TT7 523\n44774 216\nJ6666 548\nQ78K5 456\n73A33 252\nAJAJA 670\nQQ777 306\n4JA88 725\n87778 693\nK67K6 179\n7A76A 823\nT6A8T 170\nA5628 427\nK8888 115\n37733 434\nJ8888 276\n6Q792 327\n6772Q 800\n22KKK 891\n55552 545\n4T6A8 401\nKKK55 205\n93993 476\n48859 842\n64666 579\n44J42 36\n2QA67 394\n937K9 649\nK99K9 559\n553JT 512\n8959J 790\n69TK5 269\n833K9 18\n777A3 914\nJ6662 64\nJA95T 220\nKKKQK 319\nKKKK6 836\n495TA 603\nQ3K96 833\nAK435 553\nQ7744 660\nAA2A2 244\nTT9T9 305\n298K9 733\n2JJ33 736\n5AAA3 190\nKKKK2 134\nTT34K 471\n44248 655\n55J9A 949\n76677 702\n2J662 111\nK94Q9 830\nTTJQT 268\nT2TKJ 48\nJ242Q 943\n3QQ9Q 231\nQ34K3 870\nT7Q7Q 58\n6222J 850\n7JT97 377\n33KAJ 215\n3985T 813\n38663 936\nJ2623 952\nA2333 145\n74477 202\n333JJ 677\n88788 593\n477K7 618\n53533 656\n7526K 820\n2A36T 497\nTKKKK 726\nJ3362 158\nTKKTT 619\n66869 868\n98888 613\n58835 558\n55225 493\nATAAA 178\n4T3J3 154\n23K59 604\n99932 803\n6KKQK 254\n992KK 138\n855JK 382\nQQQJ3 125\n29Q38 865\nJ5455 490\nK397Q 861\n74J76 536\nT3TT3 315\n66JQ6 831\nKK638 203\n3J27K 449\n4JA44 821\n848Q4 628\n33336 530\nAA592 266\n85353 520\n2TTT9 882\nATJQ3 654\n3726K 552\n22343 845\nA6A4J 199\nK56TA 794\n6QQQ9 665\n36A95 805\nQQJ6Q 847\nTQ454 249\n9999A 687\n5K336 877\n55835 169\nJ6T39 222\n4T94K 742\nJQJQQ 564\n2A368 261\nQ6QQA 852\n98899 23\n4KK44 793\nQAA96 380\n8T5A4 801\nJJTJT 667\n288J8 522\nJ99JJ 344\n792J4 1000\nQ5266 352\nJAA92 86\nA2989 89\nJ4863 636\nJQ84K 533\n5QQ8Q 546\n66A6A 101\n25J86 410\n8A842 592\n22922 720\nA7JA7 183\n7QJ2A 109\n556J6 802\n67379 995\n23QAK 174\n44QQ4 903\nQ5K83 666\n9J5J9 876\n8Q276 42\n7TK42 351\n26999 848\n86844 727\n9A9J3 897\n7T7KT 140\nAAQTK 722\n96K59 106\nQ6Q6J 492\nAAJA3 484\n5Q238 743\n3AQ52 796\nA8A88 789\n63666 181\nA8AAJ 515\n96747 198\n55588 420\nT4222 849\n99899 795\n3K9Q5 784\n27727 691\nTTQQ9 563\n458KK 149\n2J78A 917\n224A2 496\n99K99 387\n44884 808\n26TTT 418\nQ45K7 798\n433AT 951\nQQTKJ 771\n49T8J 615\n85TQK 234\n9Q4A7 270\n6928K 752\nT4TK9 513\n4226T 207\nA7666 3\n3Q865 197\nA7777 331\n77T67 153\n22T2T 417\nAAAJ2 16\n6Q3Q5 867\n33K38 168\nKATAJ 921\n66668 189\nQ3KK2 746\nAA7KA 431\n94KQJ 260\nK9TQ6 4\n8J8QJ 458\nQ9AK9 486\n7JJ3Q 141\n77764 286\nA9KA6 474\n6T63T 309\nK4A67 815\n228J2 918\n3J939 62\n68858 985\n35555 88\nAAA9A 399\nA9495 433\nQ55J2 540\nJ9Q92 681\n93737 700\nT55J5 404\nK8922 584\nJA492 277\nTJATT 117\n4A444 239\n47922 441\n24A92 436\n5JA99 21\nAKTJ8 502\nQ6KQQ 822\n79797 68\n7Q9AT 939\n6Q268 525\n8469T 442\nQ5Q5Q 335\n44474 587\n48222 392\nKK333 735\nKKK3K 483\n265TJ 161\nT6TKJ 383\nK7664 34\nT9TTJ 880\n66339 827\nA298J 818\nKA4T7 542\nKKK44 253\nJT744 907\nAQAAQ 369\n222J2 396\nAAJA7 206\n3K4J4 537\n9JQQ3 791\nJ4J44 440\nQ6J83 412\n8822J 578\nA555A 256\nT9643 374\n77787 364\n"

	val cards = "AKQT98765432J".reverse

	def main(args: Array[String]): Unit =
	{
		val lines = input1.split('\n').toList
		val hands = lines.map(extractHand).sorted
		hands.foreach(h=> println(h+" "+h.rank))
		val r = hands.zipWithIndex.map(p => p._1.bid*(p._2+1)).sum
		println(r)
	}

	def extractHand(line: String): Hand = {
		val t = tokens(line)
		Hand(t.head, t.tail.head.toInt)
	}

	case class Hand(s: String, bid: Int) extends Ordered[Hand] {
		val firstCardScore = cards.indexOf(s.head)
		val rank: Int = cards.map(c=>rank(c)).max

		def rank(c: Char): Int = rank(s.replace('J', c))
		def rank(s: String): Int = {
			val g = s.toList.groupBy(c=>c).values.map(_.size)
			g.max match {
				case 5 => 7
				case 4 => 6
				case 3 if (g.exists(_==2)) => 5
				case 3 => 4
				case 2 if (g.count(_==2)==2) => 3
				case 2 => 2
				case _ => 1
			}
		}

		override def compare(that: Hand): Int =
		{
			if (rank<that.rank) -1
			else if (rank>that.rank) +1
			else doCompare(that)
		}

		def tail = Hand(s.tail, bid)

		def doCompare(that: Hand): Int = {
			if (s.isEmpty) 0
			else if (firstCardScore<that.firstCardScore) -1
			else if (firstCardScore>that.firstCardScore) +1
			else tail.doCompare(that.tail)
		}
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}