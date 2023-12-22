package net.snowtiger.aoc

/**
 * @author mark
 */

object AOC22
{
	val input = "2,1,211~2,3,211\n1,0,37~1,1,37\n3,3,230~4,3,230\n5,5,18~5,6,18\n3,3,130~3,6,130\n6,8,218~6,9,218\n6,3,239~8,3,239\n4,4,30~6,4,30\n7,4,74~7,6,74\n3,3,251~6,3,251\n2,0,189~2,2,189\n5,5,133~7,5,133\n1,6,194~1,8,194\n5,0,200~5,2,200\n8,2,273~8,2,274\n7,7,155~7,7,157\n3,0,267~3,1,267\n3,7,57~3,9,57\n1,3,134~1,5,134\n1,6,155~1,6,155\n0,2,276~0,4,276\n1,6,9~1,8,9\n5,4,277~8,4,277\n4,5,71~4,5,73\n1,6,314~1,8,314\n6,0,244~9,0,244\n2,2,256~2,5,256\n5,7,117~7,7,117\n0,0,1~0,1,1\n5,0,26~5,1,26\n6,3,80~7,3,80\n6,5,189~6,6,189\n9,2,26~9,4,26\n3,5,216~3,7,216\n5,6,138~5,9,138\n6,5,226~8,5,226\n8,0,219~8,1,219\n6,9,193~9,9,193\n6,6,329~6,9,329\n6,0,285~6,1,285\n8,4,215~9,4,215\n4,6,222~4,9,222\n5,2,241~6,2,241\n1,6,183~4,6,183\n5,5,196~5,7,196\n6,0,286~9,0,286\n0,3,72~2,3,72\n3,8,50~3,8,52\n3,2,59~4,2,59\n9,1,201~9,3,201\n0,7,281~0,9,281\n6,4,324~8,4,324\n3,6,53~3,8,53\n8,6,111~8,7,111\n6,4,66~8,4,66\n4,7,316~6,7,316\n0,4,105~0,6,105\n2,1,200~4,1,200\n0,8,247~3,8,247\n1,3,119~2,3,119\n5,9,47~9,9,47\n0,7,58~0,9,58\n8,3,242~8,3,244\n9,2,117~9,5,117\n0,7,110~1,7,110\n7,2,43~7,3,43\n6,0,180~6,2,180\n2,3,178~2,6,178\n5,0,98~5,0,99\n8,6,280~8,7,280\n0,9,158~2,9,158\n5,4,237~7,4,237\n4,7,269~6,7,269\n0,9,200~2,9,200\n1,2,27~1,4,27\n4,4,68~4,6,68\n1,4,136~2,4,136\n7,7,285~8,7,285\n3,6,323~4,6,323\n5,2,45~6,2,45\n9,2,170~9,3,170\n6,4,190~6,5,190\n6,0,238~6,2,238\n2,0,93~4,0,93\n7,1,66~9,1,66\n6,6,248~6,8,248\n1,2,2~2,2,2\n0,6,2~0,8,2\n4,2,56~4,2,57\n3,7,238~4,7,238\n0,5,254~3,5,254\n0,7,12~0,9,12\n2,4,161~2,6,161\n2,7,45~5,7,45\n0,8,3~3,8,3\n4,8,290~7,8,290\n0,6,321~2,6,321\n2,6,104~2,6,106\n0,2,135~2,2,135\n7,6,121~7,7,121\n8,3,22~9,3,22\n4,9,254~4,9,257\n3,6,194~3,9,194\n6,1,248~8,1,248\n6,2,85~6,5,85\n1,3,22~3,3,22\n2,4,102~3,4,102\n4,6,119~6,6,119\n8,0,13~8,2,13\n0,8,188~2,8,188\n3,1,263~4,1,263\n5,6,329~5,8,329\n8,3,251~8,5,251\n7,4,126~7,7,126\n6,4,70~6,6,70\n8,2,2~8,5,2\n6,5,285~6,8,285\n0,6,76~1,6,76\n3,5,110~3,7,110\n1,4,71~1,6,71\n7,8,60~9,8,60\n4,1,227~4,4,227\n6,7,20~8,7,20\n6,2,139~9,2,139\n4,0,226~5,0,226\n9,3,13~9,3,15\n0,7,95~0,9,95\n0,6,313~1,6,313\n5,8,123~5,9,123\n8,6,249~9,6,249\n2,5,317~3,5,317\n5,0,83~5,2,83\n5,5,328~6,5,328\n0,7,300~2,7,300\n7,2,56~7,5,56\n1,5,238~1,7,238\n1,4,225~1,5,225\n7,8,295~7,9,295\n2,0,324~2,0,326\n0,6,320~3,6,320\n7,4,5~7,6,5\n5,3,151~5,6,151\n6,0,254~8,0,254\n6,7,310~8,7,310\n2,6,243~3,6,243\n5,6,72~6,6,72\n1,2,97~3,2,97\n1,8,196~4,8,196\n9,7,67~9,9,67\n5,4,126~5,6,126\n0,2,92~0,4,92\n4,8,238~7,8,238\n5,6,132~5,9,132\n7,4,147~8,4,147\n6,6,138~8,6,138\n8,4,290~9,4,290\n8,7,249~8,9,249\n7,8,330~9,8,330\n2,0,138~2,0,139\n7,7,328~7,9,328\n3,0,294~5,0,294\n4,9,119~6,9,119\n6,3,91~6,6,91\n3,7,113~3,9,113\n8,2,173~8,4,173\n9,8,165~9,9,165\n0,2,68~2,2,68\n0,4,126~0,5,126\n0,0,26~2,0,26\n6,5,17~6,7,17\n6,0,147~9,0,147\n0,6,276~0,7,276\n3,1,316~3,3,316\n2,6,230~2,9,230\n1,5,188~1,5,189\n8,1,193~8,1,193\n1,1,30~1,2,30\n3,4,330~3,5,330\n7,5,249~9,5,249\n6,8,58~7,8,58\n7,5,101~7,7,101\n1,9,205~3,9,205\n9,5,7~9,7,7\n0,2,61~0,5,61\n2,5,238~2,7,238\n1,9,252~4,9,252\n9,2,262~9,4,262\n0,1,71~0,2,71\n0,0,211~2,0,211\n3,0,265~3,1,265\n0,4,128~2,4,128\n0,0,86~0,1,86\n4,0,182~4,1,182\n0,7,35~3,7,35\n2,7,154~2,9,154\n1,8,133~1,9,133\n1,4,34~1,4,36\n5,4,99~5,7,99\n1,3,232~3,3,232\n5,9,55~8,9,55\n6,7,280~6,9,280\n8,1,37~8,1,39\n3,0,327~4,0,327\n7,4,48~7,6,48\n6,8,101~9,8,101\n6,8,209~8,8,209\n0,0,240~2,0,240\n0,2,73~2,2,73\n9,4,1~9,6,1\n0,3,64~2,3,64\n1,8,82~1,8,83\n0,9,17~0,9,18\n6,3,115~8,3,115\n3,7,304~5,7,304\n3,1,10~3,3,10\n5,8,154~8,8,154\n4,0,271~4,0,271\n6,4,330~9,4,330\n5,4,154~5,6,154\n3,1,327~3,4,327\n4,7,318~4,7,320\n4,3,44~4,5,44\n7,5,246~7,7,246\n7,5,8~7,8,8\n1,2,213~4,2,213\n5,0,229~8,0,229\n9,5,112~9,6,112\n6,6,122~6,8,122\n5,1,207~5,2,207\n2,9,296~2,9,298\n0,2,131~0,4,131\n3,6,52~3,7,52\n3,0,138~5,0,138\n3,5,98~6,5,98\n5,2,204~6,2,204\n2,4,15~2,4,17\n0,0,330~1,0,330\n6,1,9~8,1,9\n2,1,123~2,3,123\n1,7,279~2,7,279\n0,3,275~0,4,275\n4,6,71~4,8,71\n1,1,237~2,1,237\n7,8,132~8,8,132\n5,7,279~8,7,279\n2,0,322~2,2,322\n4,0,193~6,0,193\n3,0,234~3,3,234\n9,4,165~9,7,165\n0,1,65~0,3,65\n5,1,31~7,1,31\n5,0,292~5,3,292\n2,8,251~3,8,251\n4,6,256~4,8,256\n2,6,133~4,6,133\n4,0,35~7,0,35\n5,1,101~5,2,101\n1,5,160~1,7,160\n7,5,99~7,8,99\n4,6,189~5,6,189\n0,7,232~3,7,232\n4,0,22~4,2,22\n0,3,273~0,6,273\n5,9,250~5,9,251\n1,4,67~1,6,67\n8,4,150~8,5,150\n8,5,57~8,5,59\n1,5,313~3,5,313\n4,7,75~6,7,75\n4,6,195~6,6,195\n3,6,154~3,8,154\n4,4,331~6,4,331\n7,3,137~9,3,137\n4,0,33~7,0,33\n5,7,294~5,9,294\n0,3,59~0,5,59\n7,4,318~7,7,318\n4,4,80~6,4,80\n7,7,102~9,7,102\n8,5,21~8,8,21\n2,0,212~4,0,212\n4,4,257~6,4,257\n4,0,30~6,0,30\n5,8,124~7,8,124\n3,4,88~6,4,88\n3,3,218~5,3,218\n9,1,69~9,3,69\n8,4,17~8,7,17\n3,1,335~3,4,335\n6,0,298~6,0,300\n4,7,87~4,9,87\n2,3,96~4,3,96\n6,6,324~6,8,324\n0,7,305~2,7,305\n4,6,184~6,6,184\n7,3,49~7,5,49\n6,0,201~8,0,201\n0,6,62~1,6,62\n9,5,280~9,7,280\n2,0,233~2,2,233\n0,0,29~2,0,29\n2,4,269~4,4,269\n3,3,314~3,5,314\n6,4,268~6,6,268\n0,4,197~3,4,197\n3,6,198~3,9,198\n6,8,309~9,8,309\n1,6,64~1,8,64\n1,0,120~1,1,120\n3,0,90~5,0,90\n6,7,216~7,7,216\n0,1,33~2,1,33\n4,2,147~5,2,147\n1,2,67~3,2,67\n6,6,266~8,6,266\n4,0,200~4,0,202\n2,0,329~2,0,331\n4,8,51~6,8,51\n2,3,184~3,3,184\n4,3,49~6,3,49\n5,2,51~5,2,52\n0,9,9~2,9,9\n2,4,103~5,4,103\n1,5,74~3,5,74\n6,7,326~9,7,326\n3,9,259~6,9,259\n1,3,40~1,4,40\n4,5,36~6,5,36\n7,5,292~7,8,292\n2,5,290~2,8,290\n6,3,133~9,3,133\n2,2,51~4,2,51\n1,3,315~4,3,315\n1,9,88~3,9,88\n2,5,318~4,5,318\n6,4,255~7,4,255\n7,6,214~7,8,214\n2,3,131~5,3,131\n6,1,30~9,1,30\n5,5,235~5,6,235\n6,9,58~8,9,58\n1,7,219~4,7,219\n0,3,121~1,3,121\n8,1,225~8,1,227\n4,1,248~4,2,248\n4,6,204~4,8,204\n4,1,188~5,1,188\n4,9,74~7,9,74\n4,2,19~6,2,19\n4,0,61~4,2,61\n2,4,3~2,5,3\n2,3,254~5,3,254\n3,6,148~6,6,148\n7,1,7~9,1,7\n6,4,137~6,4,138\n4,6,67~4,7,67\n3,6,31~6,6,31\n0,5,197~2,5,197\n3,4,317~4,4,317\n6,3,288~6,3,288\n5,8,261~7,8,261\n7,5,79~9,5,79\n6,9,263~6,9,266\n6,6,243~8,6,243\n5,3,224~8,3,224\n4,4,174~4,7,174\n7,2,93~7,2,96\n4,3,168~4,3,168\n0,9,156~2,9,156\n2,6,74~4,6,74\n5,1,287~5,4,287\n1,6,66~4,6,66\n5,5,129~9,5,129\n7,0,188~9,0,188\n8,4,37~8,5,37\n1,8,80~3,8,80\n4,0,296~7,0,296\n2,4,57~2,6,57\n0,5,58~1,5,58\n3,4,199~3,5,199\n6,4,79~8,4,79\n0,3,83~1,3,83\n5,9,254~7,9,254\n4,0,230~7,0,230\n1,4,223~2,4,223\n0,3,247~1,3,247\n4,2,99~8,2,99\n2,5,232~5,5,232\n1,1,292~1,4,292\n9,1,144~9,4,144\n5,5,256~5,6,256\n7,5,212~9,5,212\n4,6,24~4,8,24\n7,3,327~7,4,327\n1,3,217~4,3,217\n8,0,54~8,0,55\n4,6,213~4,7,213\n4,7,268~4,9,268\n4,8,187~7,8,187\n6,9,49~9,9,49\n0,6,182~2,6,182\n9,8,63~9,9,63\n5,3,142~5,5,142\n6,4,104~9,4,104\n6,8,211~8,8,211\n5,2,226~5,5,226\n3,6,115~6,6,115\n0,2,240~1,2,240\n4,5,213~6,5,213\n0,4,194~0,7,194\n1,0,188~1,1,188\n5,4,139~6,4,139\n4,0,186~7,0,186\n8,6,58~8,6,58\n3,0,207~5,0,207\n6,6,190~6,6,192\n1,9,85~3,9,85\n0,1,95~0,2,95\n5,6,32~5,8,32\n5,1,274~5,3,274\n3,8,244~3,9,244\n7,9,167~9,9,167\n6,4,32~6,6,32\n1,8,44~5,8,44\n6,8,55~8,8,55\n4,7,48~4,8,48\n2,7,199~2,9,199\n6,8,97~6,8,97\n8,1,275~9,1,275\n5,3,225~5,5,225\n8,8,144~8,8,146\n4,1,114~4,4,114\n1,6,233~3,6,233\n7,1,270~7,4,270\n5,0,197~7,0,197\n6,6,78~9,6,78\n3,5,197~3,7,197\n7,3,323~7,5,323\n9,6,8~9,8,8\n2,5,335~4,5,335\n1,4,329~3,4,329\n1,7,214~3,7,214\n0,3,334~1,3,334\n2,2,321~2,3,321\n0,1,7~0,1,8\n1,5,158~3,5,158\n6,6,116~6,7,116\n8,5,56~8,6,56\n2,3,284~5,3,284\n2,3,32~2,5,32\n2,4,164~2,6,164\n3,4,131~3,4,132\n8,8,164~8,8,166\n1,8,317~1,9,317\n5,2,236~5,3,236\n3,5,77~3,6,77\n5,0,183~7,0,183\n8,5,329~8,8,329\n5,1,96~7,1,96\n1,6,311~3,6,311\n0,1,333~0,4,333\n3,5,180~4,5,180\n3,7,122~3,7,125\n2,7,51~4,7,51\n4,1,66~6,1,66\n5,1,231~5,2,231\n9,1,70~9,1,73\n2,2,35~2,3,35\n5,2,279~5,5,279\n2,7,229~4,7,229\n1,4,280~2,4,280\n9,3,251~9,5,251\n2,3,154~2,6,154\n1,9,35~3,9,35\n9,9,139~9,9,140\n3,9,1~6,9,1\n1,6,6~1,8,6\n4,0,210~7,0,210\n0,4,222~0,6,222\n2,9,246~5,9,246\n7,1,230~9,1,230\n5,9,147~7,9,147\n0,6,54~2,6,54\n1,5,90~1,7,90\n4,7,225~4,7,227\n2,2,210~2,5,210\n0,3,144~0,5,144\n0,6,235~2,6,235\n4,4,166~4,6,166\n7,1,28~7,3,28\n4,0,247~6,0,247\n4,5,155~4,7,155\n3,1,100~4,1,100\n2,9,8~5,9,8\n8,3,253~8,5,253\n7,2,229~9,2,229\n3,8,121~3,9,121\n6,2,78~6,3,78\n4,4,47~7,4,47\n5,1,13~7,1,13\n1,0,322~1,2,322\n1,6,193~1,8,193\n3,2,180~5,2,180\n5,1,34~6,1,34\n3,1,201~3,2,201\n1,5,92~1,5,94\n1,9,291~3,9,291\n2,1,294~2,3,294\n1,5,185~1,8,185\n0,3,150~0,5,150\n9,4,149~9,5,149\n5,6,178~8,6,178\n5,8,139~8,8,139\n1,0,259~3,0,259\n3,3,25~3,5,25\n2,5,31~2,7,31\n2,5,139~4,5,139\n1,3,250~4,3,250\n7,3,296~7,6,296\n1,0,262~1,0,262\n4,6,239~6,6,239\n5,6,121~5,8,121\n9,3,168~9,6,168\n5,2,53~5,2,56\n5,4,336~8,4,336\n0,4,285~0,7,285\n5,3,18~8,3,18\n1,0,321~3,0,321\n8,6,202~8,8,202\n7,8,133~8,8,133\n7,0,146~7,1,146\n3,2,158~3,3,158\n4,2,206~6,2,206\n4,2,297~4,4,297\n1,8,130~3,8,130\n0,6,111~0,8,111\n0,9,5~3,9,5\n1,0,3~1,2,3\n3,0,243~3,0,243\n0,2,75~2,2,75\n5,1,146~5,3,146\n0,7,236~0,7,238\n6,9,174~9,9,174\n7,8,239~9,8,239\n6,1,132~9,1,132\n8,3,292~8,4,292\n6,6,260~6,9,260\n7,4,27~7,7,27\n2,0,318~2,3,318\n0,1,80~0,3,80\n4,6,144~4,8,144\n4,7,104~6,7,104\n3,5,133~3,5,134\n3,2,264~3,4,264\n5,1,208~7,1,208\n5,5,123~5,6,123\n6,2,42~7,2,42\n2,6,48~2,7,48\n2,1,117~5,1,117\n3,0,196~4,0,196\n0,1,225~3,1,225\n1,6,152~4,6,152\n6,5,77~9,5,77\n9,2,28~9,3,28\n4,1,237~5,1,237\n1,2,183~4,2,183\n0,6,192~3,6,192\n6,1,10~8,1,10\n8,9,82~9,9,82\n0,4,232~3,4,232\n0,3,218~2,3,218\n3,1,36~5,1,36\n8,7,322~8,9,322\n6,4,267~9,4,267\n5,0,1~5,0,2\n1,9,196~3,9,196\n6,2,88~8,2,88\n6,3,39~6,6,39\n6,4,272~9,4,272\n0,4,13~3,4,13\n9,2,226~9,5,226\n1,5,205~1,6,205\n8,5,53~8,7,53\n9,4,269~9,5,269\n2,6,259~4,6,259\n1,9,295~1,9,298\n3,1,205~4,1,205\n2,7,208~4,7,208\n7,5,321~9,5,321\n4,6,291~5,6,291\n7,9,50~9,9,50\n3,9,296~4,9,296\n7,1,63~9,1,63\n8,3,180~8,7,180\n3,1,246~5,1,246\n3,8,7~5,8,7\n7,8,44~7,9,44\n4,9,271~4,9,274\n2,5,253~2,7,253\n4,8,212~6,8,212\n7,4,76~7,6,76\n8,8,311~8,9,311\n8,2,134~8,5,134\n7,6,28~7,7,28\n1,9,148~4,9,148\n6,9,145~7,9,145\n6,5,131~7,5,131\n4,3,46~4,5,46\n6,4,244~6,7,244\n5,0,250~8,0,250\n4,0,62~4,0,63\n2,8,91~2,9,91\n4,3,173~4,7,173\n6,3,256~8,3,256\n0,1,6~2,1,6\n4,1,26~4,3,26\n1,3,242~1,3,244\n3,7,284~3,7,285\n2,7,9~2,8,9\n5,1,79~5,3,79\n3,0,324~3,3,324\n5,5,192~8,5,192\n6,3,234~8,3,234\n4,5,231~7,5,231\n3,5,182~6,5,182\n3,6,43~3,9,43\n0,6,139~3,6,139\n6,5,186~6,6,186\n9,8,218~9,9,218\n3,2,12~3,4,12\n9,6,66~9,9,66\n5,6,186~5,8,186\n8,1,171~8,3,171\n3,2,128~3,5,128\n2,7,32~2,9,32\n3,4,1~5,4,1\n3,2,29~5,2,29\n5,0,84~7,0,84\n7,7,243~8,7,243\n0,2,78~0,4,78\n9,0,189~9,0,191\n5,4,234~5,4,235\n6,0,282~6,3,282\n1,8,250~1,9,250\n4,6,190~4,6,192\n7,0,129~7,2,129\n2,0,257~2,3,257\n5,8,82~7,8,82\n1,8,91~1,9,91\n9,6,244~9,8,244\n4,0,73~4,2,73\n0,5,183~0,7,183\n2,3,8~5,3,8\n0,4,224~0,6,224\n4,2,281~7,2,281\n2,6,49~2,6,51\n6,0,37~7,0,37\n6,0,207~6,0,208\n5,4,35~7,4,35\n9,7,278~9,9,278\n3,8,296~5,8,296\n9,4,218~9,7,218\n2,4,213~4,4,213\n2,1,224~5,1,224\n3,4,236~3,6,236\n6,4,134~6,7,134\n0,7,233~0,9,233\n4,3,275~4,5,275\n2,3,121~2,6,121\n3,5,277~3,5,280\n0,2,147~0,4,147\n2,9,288~4,9,288\n7,1,141~7,2,141\n8,1,305~8,1,307\n7,2,284~9,2,284\n7,5,317~9,5,317\n1,6,99~2,6,99\n5,2,319~5,4,319\n2,1,132~2,3,132\n9,3,25~9,6,25\n4,8,134~6,8,134\n2,1,66~2,3,66\n5,0,97~5,1,97\n1,1,134~2,1,134\n4,3,206~6,3,206\n0,0,241~0,0,243\n5,5,2~5,6,2\n1,4,199~1,4,202\n8,0,304~8,3,304\n8,2,182~8,4,182\n9,3,253~9,4,253\n8,6,275~8,8,275\n9,7,190~9,8,190\n2,6,293~4,6,293\n2,3,221~2,5,221\n2,3,277~2,3,278\n5,2,39~7,2,39\n6,6,193~6,8,193\n5,5,216~6,5,216\n7,5,11~7,5,14\n0,7,5~1,7,5\n5,7,166~6,7,166\n5,9,300~5,9,301\n2,4,125~5,4,125\n1,2,332~1,3,332\n7,1,299~7,4,299\n3,6,168~3,8,168\n4,0,49~8,0,49\n6,3,88~6,3,89\n8,4,176~8,4,178\n1,2,237~4,2,237\n6,2,287~6,4,287\n5,9,75~7,9,75\n1,6,112~3,6,112\n5,2,36~6,2,36\n7,4,67~9,4,67\n5,2,227~5,2,230\n6,3,127~6,5,127\n7,1,58~7,3,58\n5,8,245~7,8,245\n3,6,69~3,9,69\n6,3,242~7,3,242\n6,6,129~6,9,129\n3,5,136~3,6,136\n0,9,262~1,9,262\n8,4,326~8,4,328\n0,5,279~0,7,279\n5,1,203~5,3,203\n4,5,293~7,5,293\n7,6,269~7,8,269\n3,5,113~6,5,113\n9,6,247~9,8,247\n6,6,180~7,6,180\n3,1,289~3,3,289\n7,4,220~7,6,220\n6,3,134~7,3,134\n4,9,321~6,9,321\n1,3,139~1,5,139\n9,5,293~9,8,293\n3,4,166~3,6,166\n1,0,285~1,0,286\n0,4,83~1,4,83\n4,2,191~4,4,191\n7,3,156~7,5,156\n0,4,266~3,4,266\n5,3,33~5,5,33\n4,2,208~4,4,208\n1,3,131~1,6,131\n0,2,41~0,4,41\n6,8,63~7,8,63\n3,1,279~3,3,279\n4,2,166~5,2,166\n6,2,170~8,2,170\n2,8,248~4,8,248\n7,3,114~9,3,114\n5,7,280~5,9,280\n4,4,231~6,4,231\n2,7,255~2,9,255\n6,7,321~8,7,321\n6,6,199~9,6,199\n2,4,184~2,5,184\n8,5,290~9,5,290\n1,3,266~3,3,266\n2,4,278~2,6,278\n3,4,77~5,4,77\n3,3,66~3,5,66\n9,5,28~9,8,28\n7,3,259~9,3,259\n7,3,139~7,5,139\n0,4,57~0,7,57\n5,5,124~8,5,124\n7,2,127~7,5,127\n6,1,94~6,3,94\n4,0,87~4,3,87\n6,8,272~8,8,272\n3,1,281~5,1,281\n0,2,48~0,3,48\n9,5,30~9,6,30\n6,3,284~7,3,284\n7,4,252~7,6,252\n1,8,241~4,8,241\n6,6,283~9,6,283\n1,2,32~3,2,32\n0,0,238~0,2,238\n5,1,78~5,3,78\n0,3,140~0,6,140\n0,8,283~0,9,283\n1,0,237~3,0,237\n6,1,245~8,1,245\n8,4,254~8,5,254\n5,2,145~5,6,145\n4,9,171~6,9,171\n0,5,282~1,5,282\n6,4,274~8,4,274\n4,3,296~4,5,296\n0,0,133~0,2,133\n7,2,173~7,2,175\n3,1,86~3,1,88\n7,4,52~8,4,52\n3,8,73~5,8,73\n5,0,196~6,0,196\n1,0,217~1,0,217\n2,6,250~2,8,250\n6,7,217~6,8,217\n1,5,298~2,5,298\n6,2,67~6,4,67\n1,2,55~3,2,55\n6,3,185~8,3,185\n3,2,182~3,3,182\n4,7,315~4,9,315\n6,7,5~9,7,5\n1,7,222~1,9,222\n7,0,224~9,0,224\n9,4,110~9,5,110\n9,1,142~9,3,142\n5,3,336~7,3,336\n3,9,248~5,9,248\n4,1,149~7,1,149\n3,6,176~7,6,176\n7,4,107~9,4,107\n0,8,191~0,8,194\n4,6,123~4,8,123\n2,2,265~5,2,265\n2,5,142~2,7,142\n2,3,79~2,5,79\n7,2,199~7,2,202\n3,2,217~5,2,217\n3,7,312~3,8,312\n1,6,147~4,6,147\n6,5,316~9,5,316\n4,1,31~4,3,31\n2,3,181~2,4,181\n6,5,247~6,7,247\n3,2,263~3,4,263\n4,4,73~6,4,73\n1,9,36~1,9,36\n6,5,15~9,5,15\n8,0,204~8,0,207\n7,1,216~9,1,216\n2,5,274~5,5,274\n2,6,114~2,8,114\n8,0,56~9,0,56\n0,3,288~1,3,288\n4,2,112~4,4,112\n9,5,189~9,7,189\n8,4,110~8,6,110\n8,2,184~8,4,184\n4,0,329~4,2,329\n3,7,307~7,7,307\n6,4,101~6,7,101\n4,3,42~4,5,42\n6,4,59~9,4,59\n1,7,87~3,7,87\n4,6,198~5,6,198\n5,7,234~5,7,236\n2,3,36~2,3,37\n1,1,192~1,3,192\n4,8,100~7,8,100\n9,3,304~9,4,304\n6,2,76~6,4,76\n0,3,66~0,4,66\n5,0,133~5,3,133\n4,4,83~6,4,83\n4,3,60~4,5,60\n4,4,15~6,4,15\n3,1,78~3,4,78\n4,9,190~6,9,190\n0,7,86~3,7,86\n2,4,59~4,4,59\n3,9,38~6,9,38\n7,5,256~9,5,256\n0,5,34~3,5,34\n0,6,106~0,7,106\n0,1,235~2,1,235\n5,2,163~5,5,163\n5,5,295~5,6,295\n4,4,99~4,6,99\n1,3,271~1,4,271\n7,5,284~7,6,284\n8,1,192~9,1,192\n7,1,34~9,1,34\n2,0,241~3,0,241\n1,2,33~1,5,33\n4,8,85~4,9,85\n7,1,145~7,4,145\n7,6,129~7,8,129\n1,6,254~3,6,254\n0,4,89~3,4,89\n4,1,230~5,1,230\n7,4,279~7,4,279\n7,1,3~8,1,3\n5,0,223~5,3,223\n2,9,155~4,9,155\n1,4,177~4,4,177\n7,4,199~8,4,199\n5,8,96~8,8,96\n4,3,29~4,5,29\n4,3,163~4,6,163\n5,9,128~6,9,128\n3,3,261~5,3,261\n2,8,94~2,9,94\n3,8,6~4,8,6\n8,7,214~8,8,214\n6,7,249~6,9,249\n5,3,258~7,3,258\n9,6,286~9,8,286\n3,1,82~3,2,82\n4,1,98~7,1,98\n3,2,281~3,3,281\n3,3,100~5,3,100\n7,2,53~7,4,53\n4,8,235~4,9,235\n0,4,332~3,4,332\n0,4,134~0,7,134\n5,1,303~5,1,305\n5,8,326~7,8,326\n4,5,50~6,5,50\n6,4,194~8,4,194\n7,2,231~9,2,231\n2,6,93~4,6,93\n2,1,242~4,1,242\n2,1,70~4,1,70\n1,2,269~1,4,269\n4,5,248~6,5,248\n0,4,227~0,6,227\n4,6,234~4,8,234\n4,8,264~6,8,264\n4,9,156~5,9,156\n8,1,148~9,1,148\n1,0,99~1,3,99\n4,5,229~6,5,229\n8,1,231~8,1,234\n9,0,287~9,1,287\n0,3,142~0,5,142\n3,7,83~6,7,83\n6,2,177~8,2,177\n7,8,49~9,8,49\n2,5,297~2,7,297\n3,6,196~3,7,196\n0,0,136~4,0,136\n0,5,25~0,7,25\n3,2,15~3,4,15\n8,1,68~8,4,68\n2,6,255~5,6,255\n1,8,256~3,8,256\n1,9,3~4,9,3\n7,5,218~7,8,218\n8,7,54~9,7,54\n4,7,290~6,7,290\n1,8,48~3,8,48\n3,0,287~3,3,287\n6,2,300~7,2,300\n4,9,125~6,9,125\n6,3,3~6,3,5\n8,4,284~8,6,284\n7,4,223~9,4,223\n4,1,244~6,1,244\n8,6,221~9,6,221\n5,5,193~7,5,193\n2,2,119~4,2,119\n2,5,319~2,6,319\n0,4,38~2,4,38\n3,3,82~6,3,82\n4,2,122~4,3,122\n4,7,84~4,9,84\n0,2,46~0,4,46\n0,9,157~2,9,157\n1,3,180~4,3,180\n3,7,112~3,9,112\n4,1,270~4,4,270\n2,6,241~4,6,241\n4,0,189~4,3,189\n4,3,170~6,3,170\n7,1,197~7,4,197\n1,3,3~3,3,3\n8,1,213~8,4,213\n0,1,190~1,1,190\n8,6,79~8,9,79\n0,7,92~1,7,92\n4,8,269~4,8,272\n0,7,294~2,7,294\n0,3,15~0,6,15\n7,7,56~8,7,56\n6,2,182~6,4,182\n1,0,130~3,0,130\n9,4,271~9,6,271\n2,5,186~4,5,186\n1,8,308~3,8,308\n2,7,302~4,7,302\n2,3,23~4,3,23\n7,9,140~8,9,140\n3,8,267~6,8,267\n4,7,231~6,7,231\n3,2,239~5,2,239\n4,7,185~6,7,185\n3,9,318~4,9,318\n6,5,34~8,5,34\n7,4,314~7,6,314\n7,0,52~9,0,52\n3,0,129~3,2,129\n5,1,235~6,1,235\n2,9,279~4,9,279\n7,9,244~9,9,244\n5,3,259~6,3,259\n5,2,272~8,2,272\n2,5,78~2,8,78\n0,6,75~3,6,75\n1,6,181~4,6,181\n7,4,263~7,6,263\n6,4,211~8,4,211\n2,3,332~5,3,332\n2,7,207~4,7,207\n5,9,45~6,9,45\n7,5,281~7,8,281\n3,6,21~5,6,21\n0,0,144~2,0,144\n0,1,291~3,1,291\n4,3,211~4,5,211\n3,4,214~5,4,214\n5,9,42~7,9,42\n1,5,333~4,5,333\n9,2,17~9,4,17\n8,0,222~8,2,222\n6,7,163~9,7,163\n0,1,239~0,4,239\n6,3,214~6,6,214\n4,9,135~7,9,135\n2,5,168~2,8,168\n4,5,23~4,6,23\n4,9,170~7,9,170\n4,3,165~6,3,165\n1,3,285~3,3,285\n8,5,261~9,5,261\n6,8,46~7,8,46\n4,5,240~4,7,240\n1,4,186~1,6,186\n6,0,240~6,0,242\n3,7,201~3,9,201\n4,1,185~5,1,185\n6,4,49~6,6,49\n5,4,192~7,4,192\n7,0,46~7,2,46\n6,7,23~7,7,23\n7,4,80~9,4,80\n5,3,234~5,3,234\n7,5,20~8,5,20\n0,6,102~3,6,102\n3,3,19~4,3,19\n8,1,146~8,3,146\n2,8,203~2,9,203\n7,1,4~9,1,4\n0,2,58~0,4,58\n2,2,214~4,2,214\n9,4,185~9,4,186\n6,6,94~6,8,94\n3,4,63~6,4,63\n1,5,69~1,5,69\n3,1,203~4,1,203\n3,1,338~4,1,338\n3,4,65~5,4,65\n7,9,137~9,9,137\n2,0,210~3,0,210\n1,1,214~1,3,214\n9,1,61~9,4,61\n0,6,20~0,6,22\n8,6,183~8,8,183\n5,5,73~5,7,73\n8,9,280~8,9,282\n2,4,156~2,5,156\n0,3,19~0,3,20\n2,6,294~5,6,294\n2,8,195~3,8,195\n2,4,96~2,7,96\n0,7,108~0,9,108\n6,1,65~9,1,65\n1,1,68~3,1,68\n4,0,197~4,3,197\n6,0,39~7,0,39\n1,3,178~1,5,178\n0,9,155~0,9,155\n4,2,23~7,2,23\n3,5,97~3,8,97\n0,0,4~0,3,4\n6,3,236~6,5,236\n4,2,268~4,3,268\n5,9,255~8,9,255\n8,8,205~8,8,207\n1,0,284~1,2,284\n7,4,78~8,4,78\n7,7,261~8,7,261\n3,2,301~6,2,301\n5,0,199~8,0,199\n6,6,151~8,6,151\n0,2,323~1,2,323\n0,1,34~2,1,34\n2,8,83~2,9,83\n6,3,317~6,6,317\n3,4,74~5,4,74\n4,4,110~7,4,110\n4,4,14~4,5,14\n8,2,117~8,4,117\n5,8,131~8,8,131\n5,1,119~5,2,119\n2,7,251~4,7,251\n8,3,205~8,6,205\n1,5,288~1,7,288\n5,1,218~5,2,218\n6,5,72~7,5,72\n9,2,136~9,4,136\n3,2,271~3,5,271\n5,7,238~5,7,241\n7,7,296~7,9,296\n1,7,309~2,7,309\n8,0,278~8,2,278\n4,3,97~5,3,97\n4,5,183~4,5,185\n6,5,234~6,6,234\n4,1,37~5,1,37\n0,9,151~3,9,151\n7,2,25~7,4,25\n2,5,179~3,5,179\n2,3,156~3,3,156\n2,9,81~4,9,81\n2,6,201~4,6,201\n0,1,217~1,1,217\n3,1,317~3,3,317\n1,1,117~1,2,117\n4,3,231~8,3,231\n0,1,136~2,1,136\n3,1,85~3,2,85\n9,4,139~9,7,139\n2,9,51~4,9,51\n6,9,278~8,9,278\n2,7,7~2,9,7\n7,6,52~7,9,52\n5,2,68~5,4,68\n2,2,230~4,2,230\n6,0,6~9,0,6\n0,7,197~0,7,198\n7,8,264~9,8,264\n1,2,278~3,2,278\n9,2,71~9,3,71\n7,6,242~7,8,242\n1,3,69~2,3,69\n2,2,288~2,4,288\n1,5,285~1,5,287\n7,1,273~9,1,273\n8,5,259~8,7,259\n5,1,151~7,1,151\n7,6,153~7,8,153\n0,0,139~0,0,141\n6,7,29~8,7,29\n7,6,196~9,6,196\n1,7,127~4,7,127\n3,8,127~5,8,127\n0,5,18~0,6,18\n0,3,272~2,3,272\n1,1,102~3,1,102\n2,5,28~5,5,28\n4,1,287~4,3,287\n6,7,239~6,9,239\n0,2,83~2,2,83\n3,5,310~3,7,310\n5,1,302~7,1,302\n9,4,184~9,7,184\n1,8,151~1,8,152\n6,0,27~9,0,27\n1,4,84~2,4,84\n3,6,95~5,6,95\n4,7,189~4,9,189\n4,2,221~6,2,221\n5,1,232~6,1,232\n4,4,318~6,4,318\n3,0,204~6,0,204\n8,7,276~9,7,276\n5,5,326~7,5,326\n3,2,79~3,5,79\n5,1,295~5,1,297\n5,3,286~8,3,286\n9,6,186~9,7,186\n2,3,209~4,3,209\n0,4,319~2,4,319\n0,7,188~3,7,188\n4,0,2~4,2,2\n8,4,83~9,4,83\n2,5,59~3,5,59\n2,2,48~5,2,48\n3,5,90~3,7,90\n1,0,215~1,2,215\n7,5,196~8,5,196\n9,6,250~9,9,250\n1,3,329~4,3,329\n7,4,313~7,7,313\n9,2,10~9,5,10\n9,3,146~9,4,146\n4,3,81~6,3,81\n2,1,275~2,3,275\n0,4,243~2,4,243\n3,5,29~3,7,29\n1,7,46~1,8,46\n6,0,188~6,0,191\n6,6,202~6,8,202\n4,8,79~5,8,79\n0,6,257~2,6,257\n7,8,142~8,8,142\n7,1,198~9,1,198\n1,2,282~3,2,282\n5,9,89~5,9,92\n2,1,245~4,1,245\n5,9,297~5,9,297\n2,1,317~2,4,317\n7,5,282~7,7,282\n3,7,55~3,9,55\n7,4,148~8,4,148\n5,1,81~7,1,81\n4,1,322~7,1,322\n8,3,19~8,3,21\n2,9,71~4,9,71\n2,6,194~2,9,194\n3,3,32~3,5,32\n5,0,150~7,0,150\n0,9,260~3,9,260\n2,7,211~4,7,211\n4,4,117~6,4,117\n0,0,190~2,0,190\n2,9,118~4,9,118\n9,5,324~9,8,324\n7,4,150~7,5,150\n4,6,97~5,6,97\n7,0,3~7,0,3\n0,1,81~0,1,84\n6,2,143~7,2,143\n1,3,238~4,3,238\n2,0,270~4,0,270\n2,2,17~2,2,17\n5,8,161~8,8,161\n1,1,116~5,1,116\n1,4,240~2,4,240\n1,0,251~1,3,251\n4,1,11~4,4,11\n5,0,185~7,0,185\n7,7,205~9,7,205\n5,9,143~7,9,143\n5,7,143~5,8,143\n4,2,125~6,2,125\n8,7,160~8,8,160\n3,7,230~3,8,230\n5,0,3~5,0,6\n6,6,327~6,8,327\n2,6,1~4,6,1\n2,1,240~2,3,240\n4,0,252~7,0,252\n4,1,143~8,1,143\n6,7,85~8,7,85\n2,1,295~2,1,298\n3,1,8~5,1,8\n4,6,236~4,9,236\n9,8,4~9,9,4\n3,0,6~3,3,6\n2,3,18~4,3,18\n0,6,289~1,6,289\n3,5,160~5,5,160\n8,6,246~8,8,246\n0,7,13~0,8,13\n4,7,287~4,9,287\n3,4,164~4,4,164\n4,1,179~4,5,179\n7,1,97~8,1,97\n0,2,16~0,5,16\n3,4,72~3,6,72\n1,3,59~1,6,59\n2,4,165~2,5,165\n9,0,263~9,2,263\n1,6,108~3,6,108\n2,4,277~2,7,277\n5,7,86~5,9,86\n0,2,14~0,4,14\n0,1,248~2,1,248\n9,5,29~9,7,29\n1,9,37~1,9,40\n4,3,141~4,6,141\n7,8,215~9,8,215\n0,9,153~2,9,153\n7,7,182~9,7,182\n2,6,265~5,6,265\n0,2,44~0,3,44\n7,3,301~9,3,301\n8,2,16~8,4,16\n5,2,288~5,2,290\n0,2,242~0,2,244\n4,5,146~6,5,146\n3,9,41~6,9,41\n3,2,34~6,2,34\n3,4,229~5,4,229\n2,5,322~5,5,322\n6,0,148~9,0,148\n4,0,134~5,0,134\n6,7,308~6,9,308\n6,5,87~6,7,87\n4,5,134~5,5,134\n5,3,17~5,5,17\n5,4,265~7,4,265\n2,2,86~4,2,86\n7,0,91~7,4,91\n7,2,1~9,2,1\n1,5,150~1,8,150\n0,1,215~0,4,215\n8,7,157~8,8,157\n7,8,163~9,8,163\n3,4,2~7,4,2\n9,8,51~9,8,52\n5,5,84~5,7,84\n7,1,235~7,3,235\n7,4,331~7,6,331\n2,1,186~2,4,186\n7,9,329~7,9,329\n4,6,308~4,9,308\n4,4,91~4,5,91\n2,8,141~5,8,141\n5,3,112~5,4,112\n2,3,113~2,6,113\n9,4,289~9,6,289\n8,2,153~8,5,153\n0,8,19~0,8,19\n6,3,140~6,4,140\n0,0,192~0,3,192\n4,4,126~4,6,126\n6,7,142~9,7,142\n5,8,3~5,9,3\n2,2,100~2,4,100\n1,5,306~1,8,306\n3,3,181~4,3,181\n2,2,16~5,2,16\n5,5,121~7,5,121\n0,8,16~0,9,16\n1,7,144~2,7,144\n2,7,282~4,7,282\n0,8,61~0,9,61\n5,6,139~5,6,141\n4,4,260~5,4,260\n5,5,210~7,5,210\n0,4,133~0,6,133\n1,4,204~1,6,204\n7,5,120~7,7,120\n5,4,165~5,7,165\n9,8,70~9,8,72\n8,5,181~8,6,181\n3,9,277~7,9,277\n2,9,50~5,9,50\n1,7,252~3,7,252\n1,2,53~4,2,53\n2,2,241~2,4,241\n2,6,312~4,6,312\n6,5,319~6,5,319\n9,7,241~9,9,241\n9,7,251~9,9,251\n1,4,39~5,4,39\n4,6,285~4,7,285\n0,1,194~0,3,194\n3,9,293~5,9,293\n7,0,325~7,2,325\n2,9,128~4,9,128\n0,3,219~0,5,219\n2,6,292~2,8,292\n4,2,320~4,5,320\n1,5,133~2,5,133\n7,2,261~7,4,261\n1,0,243~2,0,243\n9,6,80~9,6,82\n1,0,185~1,2,185\n3,7,120~4,7,120\n7,5,140~7,7,140\n6,0,144~6,2,144\n9,7,2~9,9,2\n4,2,167~6,2,167\n3,2,94~3,6,94\n3,9,154~4,9,154\n8,5,224~8,7,224\n0,4,123~2,4,123\n8,5,194~8,7,194\n4,7,80~4,9,80\n1,0,328~3,0,328\n2,8,76~5,8,76\n1,8,298~3,8,298\n5,3,77~7,3,77\n3,2,202~3,3,202\n0,2,336~0,2,339\n2,0,24~6,0,24\n6,3,209~6,6,209\n4,7,145~4,9,145\n8,6,113~8,8,113\n5,2,334~5,4,334\n3,9,116~6,9,116\n5,7,309~6,7,309\n2,2,116~2,3,116\n1,9,294~4,9,294\n1,1,138~3,1,138\n6,7,52~6,8,52\n3,0,262~3,1,262\n2,6,288~4,6,288\n6,6,183~6,8,183\n6,1,319~6,3,319\n7,6,55~8,6,55\n7,3,50~9,3,50\n0,4,82~3,4,82\n1,6,262~2,6,262\n7,3,112~7,5,112\n4,2,302~7,2,302\n1,3,24~1,4,24\n4,4,234~4,4,237\n7,6,50~8,6,50\n7,0,218~7,1,218\n2,9,114~4,9,114\n6,3,135~6,6,135\n5,3,130~8,3,130\n2,3,237~4,3,237\n0,0,218~0,1,218\n3,7,119~5,7,119\n0,6,189~0,7,189\n4,7,310~4,7,312\n1,8,202~1,9,202\n7,4,153~7,5,153\n7,1,172~9,1,172\n5,5,270~6,5,270\n1,2,239~1,4,239\n2,4,130~2,4,132\n9,6,145~9,7,145\n0,0,214~0,2,214\n5,1,190~8,1,190"
	val input1 = "1,0,1~1,2,1\n0,0,2~2,0,2\n0,2,3~2,2,3\n0,0,4~0,2,4\n2,0,5~2,2,5\n0,1,6~2,1,6\n1,1,8~1,1,9"

	def main(args: Array[String]): Unit =
	{
		val lines = input.split("\\\n").toList
		val bricks = lines.map(parseBrick).toVector
		val space = Space(bricks)
		space.print()

		val t = System.currentTimeMillis()
		val fallen = space.fall._1
		fallen.print()
		println(fallen.disintegratable)
		//println(fallen.disintegratable2)
		println(fallen.chainReaction)
		println((System.currentTimeMillis()-t)+"ms")
	}

	def parseBrick(line: String): Brick = {
		val s"$x1,$y1,$z1~$x2,$y2,$z2" = line
		if (x1>x2 || y1>y2 || z1>z2)
			throw new Exception("Brick ends unexpected way around")
		Brick(Point(x1.toInt,y1.toInt,z1.toInt), Point(x2.toInt,y2.toInt,z2.toInt))
	}

	case class Point(x: Int, y: Int, z: Int) {
		def add(p: Point) = Point(x+p.x, y+p.y, z+p.z)
		override def toString: String = s"($x,$y,$z)"
	}

	/** All ordinates in a expected to be lower or equal to b. Ends are inclusive. */
	case class Brick(a: Point, b: Point) {
		def intersectXY(other: Brick) = other.a.x<=b.x && other.b.x>=a.x && other.a.y<=b.y && other.b.y>=a.y
		def fallTo(z: Int) = Brick(Point(a.x,a.y,z), Point(b.x,b.y,z+b.z-a.z))
		override def toString: String = a+" -> "+b
	}

	case class Space(bricks: Vector[Brick]) {
		def print() = {
			bricks.foreach(println)
			println()
		}

		/** Returns the new space with all bricks fallen to their lowest level, plus the number of bricks that fell. */
		def fall: (Space,Int) = {
			var fallen = Vector[Brick]()
			var floating = bricks.sortBy(_.a.z)
			var nFell = 0
			while (floating.nonEmpty) {
				val (lowest,rest) = floating.span(_.a.z==floating.head.a.z)
				for (low <- lowest) {
					val below = fallen.filter(_.intersectXY(low))
					val newLow = if (below.isEmpty) low.fallTo(1) else low.fallTo(1+below.map(_.b.z).max)
					if (newLow.a.z<low.a.z)
						nFell+= 1
					fallen = fallen :+ newLow
				}
				floating = rest
			}
			(Space(fallen.sortBy(_.a.z)), nFell)
		}

		/** Fast way of checking which bricks aren't the only support for any bricks above.
		 *  However it would be harder to generalise it to the "chain reaction" problem of part 2 */
		def disintegratable: Int = {
			var n = 0
			var checking = bricks.sortBy(_.a.z)
			while (checking.nonEmpty) {
				val (lowest,rest) = checking.span(_.a.z==checking.head.a.z)
				for (low <- lowest) {
					val z = low.b.z
					val above = rest.dropWhile(_.a.z<=z).takeWhile(_.a.z==1+z).filter(low.intersectXY)
					if (above.isEmpty)
						n+= 1
					else {
						val others = bricks.filter(_!=low).sortBy(_.b.z).dropWhile(_.b.z<z).takeWhile(_.b.z==z)
						if (above.forall(b=> others.exists(_.intersectXY(b))))
							n+= 1
					}
				}
				checking = rest
			}
			n
		}

		/** Slow way - just remove a brick at a time and run the fall algorithm on the remainder; if any fell, the
		 *  brick wasn't disintegratable. This generalises nicely to the Part 2 solution (see below). */
		def disintegratable2: Int = {
			var n = 0
			var checking = bricks.sortBy(_.a.z)
			while (checking.nonEmpty) {
				val newSpace = Space(bricks.filter(_!=checking.head))
				val (fallen,nFallen) = newSpace.fall
				if (nFallen==0)
					n+= 1
				checking = checking.tail
			}
			n
		}

		/** Just take a brick out at a time, run the fall algorithm to see how many other bricks would fall, sum up.
		 *  Bit slow - 20 seconds on the main input - but that's fine. */
		def chainReaction: Int = {
			var n = 0
			var checking = bricks.sortBy(_.a.z)
			while (checking.nonEmpty) {
				val newSpace = Space(bricks.filter(_!=checking.head))
				val (fallen,nFallen) = newSpace.fall
				n+= nFallen
				checking = checking.tail
			}
			n
		}
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}