package Clases;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
espacio=[ ,\t,\r,\n]+
%cup
%full
%line
%char

%{
   private Symbol symbol(int type,Object value){
        return new Symbol(type,yyline,yycolumn, value);
       }
 private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn);
       }
%}

%%
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
("battery"|"bed"|"bicycle"|"bird"|"book"|"bottle"|"boyfriend"|"brother building"|"bulb"|"car"|"cat"|"chair"|"charger"|"cloud"|"contry"|"county"|"guatemala"
|"cyclist"|"day"|"year"|"month"|"week"|"desk"|"disk"|"dog"|"dress"|"earphone"|"ring"|"face"|"father"|"field"|"finger"|"flower"|"folder"|"food"|"football"
|"frog"|"girlfriend"|"glass"|"glasses"|"glove"|"grandfather"|"grandmother"|"grocery"|"guitar"|"hand"|"high school"|"home"|"horse"|"house"|"intelligence"
|"justice"|"key"|"keyboard"|"letter"|"light"|"lion"|"love"|"memory"|"mother in law"|"father in law"|"sister in law"|"brother in law"|"mouth"|"movie"|"movies"
|"music"|"song"|"necjlace"|"newspaper"|"news"|"breaking news"|"notebook"|"class"|"classmate"|"teacher"|"pain"|"pencil"|"picture"|"photo"|"camera"|"food"|"apple"
|"cellphone"|"pineapple"|"potato"|"rain"|"road"|"sadness"|"sea"|"seat"|"ship"|"shoes"|"sister"|"sky"|"son"|"sock"|"sound"|"store"|"street"|"table"|"theatre"
|"think"|"tie"|"tiger"|"tomato"|"tooth"|"theeth"|"town"|"watch"|"water"|"wine"|"bear"|"bee"|"honey"|"bird"|"internet"|"video"|"videogames"|"computer"|"daniel"|"douglas"|"byron"|"cristopher"|"mynor"|"jeans"|"shirt"|"money"|"clouth"|"bus"|"spider"|"man"|"woman"|"men"|"women"|"backpack"|"pack"|"controller"|"crown"|"air"|"ocean"|"city"|"america"|"central america"|"europe"|"asia"|"africa"|"covid-19"|"minutes"|"hours"|"days"|"seconds")  {return new Symbol(sym.Sustantivos, yychar, yyline,yytext()); }

("my"|"your"|"his"|"her"|"its"|"our"|"their") {return new Symbol(sym.AdPosesivos, yychar, yyline,yytext()); }

("that"|"this"|"these"|"those") {return new Symbol(sym.AdDemostrativos, yychar, yyline,yytext()); }

("honest"|"intelligent"|"optimistic"|"brave"|"friendly"|"tolerant"|"sensible"|"generous"|"responsible"|"hard-working"
|"adorable"|"dishonest"|"foolish"|"pessimistic"|"coward"|"rude"|"intolerant"|"senseless"|"selfish"|"irresponsible"|"lazy"|"detestable"
|"big"|"huge"|"heavy"|"thick"|"high"|"tall"|"deep"|"small"|"tiny"|"light"|"thin"|"low"|"short"|"superficial"|"old"|"modern"|"updated"
|"slow"|"future"|"cold"|"warm"|"hot"|"cool"|"beautiful"|"clean"|"elegant"|"chubby"|"pretty"|"attractive"|"horrible"|"dirty"|"informal"
|"skinny"|"ugly"|"unattractive"|"red"|"yellow"|"blue"|"pink"|"brown"|"green"|"orange"|"purple"|"black"|"white"|"gray"|"crazy"|"sick"
|"drunk"|"asleep"|"hungry"|"energetic"|"dead"|"open"|"single"|"sane"|"healthy"|"sober"|"awake"|"full"|"tired"|"alive"|"closed"|"married"
|"hard"|"rough"|"solid"|"wet"|"slippery"|"soft"|"smooth"|"liquid"|"dry"|"sticky"|"happy"|"angry"|"proud"|"grumpy"|"jealous"|"scary"
|"sad"|"calm"|"embarrassed"|"nice"|"faithful"|"peaceful")	 {return new Symbol(sym.AdCalificativos, yychar, yyline,yytext()); }



("one"|"two"|"three"|"four"|"five"|"six"|"seven"|"eight"|"nine"|"ten"|"eleven"|"twelve"|"thirteen"|"fourteen"|"fifteen"
|"sixteen"|"seventeen"|"eighteen"|"nineteen"|"twenty"|"thirty"|"fourty"|"fifty"|"sixty"|"seventy"|"eighty"|"ninety"|"hundred"
|"one hundred"|"two hundred"|"one thousand"|"ten thousand"|"million"|"one million")  {return new Symbol(sym.AdNumCardinal, yychar, yyline,yytext()); }

("first"|"second"|"third"|"fourth"|"fifth"|"sixth"|"seventh"|"eighth"|"ninth"|"tenth"|"eleventh"|"twelfth"|"thirteenth"
|"fourteenth"|"fifteenth"|"sixteenth"|"seventeenth"|"eighteenth"|"nineteenth"|"twentieth"|"thirtieth"|"forieth"|"fiftieth"|"sixtieth"
|"seventieth"|"eightieth"|"ninetieth"|"one hundredth"|"one millionth")  {return new Symbol(sym.AdNumOrdinal, yychar, yyline,yytext()); }

("some"|"few"|"less"|"bad"|"ill"|"far"|"good"|"well"|"late"|"little"|"many"|"much"|"one"|"other"|"others"|"such"|"both") {return new Symbol(sym.AdIndefinidos, yychar, yyline,yytext()); }

"the" {return new Symbol(sym.ArtDefinidos, yychar, yyline,yytext()); }

("an"|"a") {return new Symbol(sym.ArtIndefinidos, yychar, yyline,yytext()); }

"I" {return new Symbol(sym.PronI, yychar, yyline,yytext()); }
("i"|"you"|"she"|"he"|"it") {return new Symbol(sym.PronPerSingulares, yychar, yyline,yytext()); }
("we"|"they"|"you") {return new Symbol(sym.Sustantivos, yychar, yyline,yytext()); }
("i"|"you"|"she"|"he"|"it"|"they"|"we") {return new Symbol(sym.PronPer, yychar, yyline,yytext()); }
("this"|"that"|"these"|"those"|"none"|"one"|"ones"|"such") {return new Symbol(sym.PronDemostrativos, yychar, yyline,yytext()); }
("where"|"when"|"why"|"how"|"who"|"whose"|"what"|"which") {return new Symbol(sym.PronInterrogativos, yychar, yyline,yytext()); }
"am" {return new Symbol(sym.VerbAm, yychar, yyline,yytext()); }
"are" {return new Symbol(sym.VerbAre, yychar, yyline,yytext()); }
"was" {return new Symbol(sym.VerbWas, yychar, yyline,yytext()); }
"is" {return new Symbol(sym.VerbIs, yychar, yyline,yytext()); }
"were" {return new Symbol(sym.VerbWere, yychar, yyline,yytext()); }
"be" {return new Symbol(sym.VerbBe, yychar, yyline,yytext()); }
"being" {return new Symbol(sym.VerbBeing, yychar, yyline,yytext()); }

("accept"|"add"|"admit"|"allow"|"agree"|"answer"|"arrive"|"appear"|"ask"|"believe"|"belong"|"brush"|"call"|"cancel"
|"change"|"clean"|"close"|"complain"|"complete"|"cook"|"copy"|"count"|"cry"|"dance"|"decide"|"decorate"|"destroy"|"drop"|"dry"|"enjoy"
|"excape"|"explain"|"finish"|"fix"|"follow"|"guess"|"happend"|"hate"|"help"|"imagine"|"improve"|"increase"|"invent"|"invite"|"join"
|"jump"|"kill"|"kiss"|"laugh"|"learn"|"like"|"listen"|"live"|"look"|"love"|"measure"|"mention"|"need"|"notice"|"offer"|"open"|"order"
|"organize"|"paint"|"place"|"pay"|"please"|"practice"|"prepare"|"qualify"|"rain"|"recieve"|"remember"|"remind"|"repeat"|"report"
|"require"|"return"|"search"|"sign"|"smile"|"start"|"stop"|"study"|"talk"|"touch"|"translate"|"travel"|"try"|"use"|"visit"|"wait"|"walk"
|"want"|"watch"|"wish"|"work"|"worry"|"act"|"beg"|"belong"|"charge"|"dress"|"die"|"hope"|"miss"|"marry"|"prefer"|"promise"|"study"
|"smoke"|"thank"|"touch"|"wash"|"wish") {return new Symbol(sym.VerbosRegPresent, yychar, yyline,yytext()); }

("accepting"|"adding"|"admiting"|"allowing"|"agreeing"|"answering"|"arriving"|"appearing"|"asking"|"believing"|"belonging"|"brushing"|"calling"|"canceling"
|"changing"|"cleaning"|"closing"|"complaining"|"completing"|"cooking"|"copying"|"counting"|"crying"|"dancing"|"deciding"|"decorating"|"destroying"|"droping"|"drying"|"enjoying"
|"excaping"|"explaining"|"finishing"|"fixing"|"following"|"guessing"|"happending"|"hating"|"helping"|"imagining"|"improving"|"increasing"|"inventing"|"inviting"|"joining"
|"jumping"|"killing"|"kissing"|"laughing"|"learning"|"likeing"|"listening"|"living"|"looking"|"loveing"|"measureing"|"mentioning"|"needing"|"noticeing"|"offering"|"opening"|"ordering"
|"organizing"|"painting"|"placing"|"paying"|"pleasing"|"practicing"|"preparing"|"qualifying"|"raining"|"recieving"|"remembering"|"reminding"|"repeating"|"reporting"
|"requiring"|"returning"|"searching"|"signing"|"smiling"|"starting"|"stoping"|"studying"|"talking"|"touching"|"translating"|"traveling"|"trying"|"using"|"visiting"|"waiting"|"walking"
|"wanting"|"watching"|"wishing"|"working"|"worrying"|"acting"|"beging"|"belonging"|"charging"|"dressing"|"dying"|"hoping"|"missing"|"marrying"|"prefering"|"promising"|"studying"
|"smoking"|"thanking"|"touching"|"washing"|"wishing") {return new Symbol(sym.VerbosRegIng, yychar, yyline,yytext()); }

("accepted"|"added"|"admited"|"allowed"|"agreed"|"answered"|"arrived"|"appeared"|"asked"|"believed"|"belonged"|"brushed"|"called"|"canceled"
|"changed"|"cleaned"|"closed"|"complained"|"completed"|"cooked"|"copied"|"counted"|"cried"|"danced"|"decided"|"decorated"|"destroyed"|"dropped"|"dryed"|"enjoyed"
|"excaped"|"explained"|"finished"|"fixed"|"followed"|"guessed"|"happended"|"hated"|"helped"|"imagined"|"improved"|"increased"|"invented"|"invited"|"joined"
|"jumped"|"killed"|"kissed"|"laughed"|"learned"|"liked"|"listened"|"lived"|"looked"|"loved"|"measured"|"mentioned"|"needed"|"noticed"|"offered"|"opened"|"ordered"
|"organized"|"painted"|"placed"|"payed"|"pleased"|"practiced"|"prepared"|"qualifyed"|"rained"|"recieved"|"remembered"|"reminded"|"repeated"|"reported"
|"required"|"returned"|"searched"|"signed"|"smiled"|"started"|"stopped"|"studyed"|"talked"|"touched"|"translated"|"traveled"|"tryed"|"used"|"visited"|"waited"|"walked"
|"wanted"|"watched"|"wished"|"worked"|"worried"|"acted"|"beged"|"belonged"|"charged"|"dressed"|"died"|"hoped"|"missed"|"married"|"prefered"|"promised"|"studied"
|"smoked"|"thanked"|"touched"|"washed"|"wished") {return new Symbol(sym.VerbRegPast, yychar, yyline,yytext()); }

("arise"|"awake"|"bear"|"beat"|"become"|"begin"|"bend"|"bet"|"bid"|"bind"|"bite"|"bleed"|"blow"|"break"|"breed"|"bring"
|"build"|"burn"|"burst"|"buy"|"cast"|"catch"|"choose"|"cling"|"come"|"cost"|"creep"|"cut"|"deal"|"dig"|"do"|"draw"|"dream"|"drink"
|"drive"|"eat"|"fall"|"feed"|"feel"|"fight"|"find"|"flee"|"fly"|"forbid"|"forget"|"forgive"|"freeze"|"get"|"give"|"go"
) {return new Symbol(sym.VerbosIrregPresent, yychar, yyline,yytext()); }

("arising"|"awaking"|"bearing"|"beating"|"becoming"|"begining"|"bending"|"beting"|"biding"|"binding"|"biteing"|"bleeding"|"blowing"|"breaking"|"breeding"|"bringing"
|"building"|"burning"|"bursting"|"buying"|"casting"|"catching"|"choosing"|"clinging"|"coming"|"costing"|"creeping"|"cuting"|"dealing"|"digging"|"doing"|"drawing"|"dreaming"|"drinking"
|"driving"|"eating"|"falling"|"feeding"|"feeling"|"fighting"|"finding"|"fleeing"|"flying"|"forbiding"|"forgeting"|"forgiving"|"freezing"|"geting"|"giving"|"going") {return new Symbol(sym.VerbIrregIng, yychar, yyline,yytext()); }

("arose"|"awoke"|"bore"|"beat"|"became"|"began"|"bent"|"bet"|"bid"|"bound"|"bit"|"bled"|"blew"|"broke"|"bred"|"brought"
|"built"|"burnt"|"burst"|"bought"|"cast"|"caught"|"chose"|"clung"|"came"|"cost"|"crept"|"cut"|"dealt"|"dug"|"did"|"drew"|"dreamt"|"drank"
|"drove"|"ate"|"fell"|"fed"|"felt"|"fought"|"found"|"fled"|"flew"|"forbade"|"forgot"|"forgave"|"froze"|"got"|"gave"|"went") {return new Symbol(sym.VerbIrregPast, yychar, yyline,yytext()); }

("early"|"late"|"earlier"|"later"|"then"|"before"|"after"|"afterwards"|"now"|"nowadays"|"these days"|"currently"|"at present"
|"today"|"tomorrow"|"yesterday"|"still"|"already"|"yet"|"no yet"|"no longer"|"just"|"ever"|"soon"|"again"|"thereafter"|"lately"
|"recently"|"formerly"|"latterly"|"in the past"|"in the future"|"this week"|"next week"|"last week"|"this year"|"last year"|"next year"
|"meanwhile"|"someday"|"shortly"|"ago" ) {return new Symbol(sym.AdvTiempo, yychar, yyline,yytext()); }

("here"|"there"|"near"|"nearby"|"far"|"away"|"home"|"abroad"|"in"|"out"|"inside"|"outside"|"indoors"|"outdoors"|"above"
|"below"|"underneath"|"beneath"|"ahead"|"behind"|"in front"|"oppsite"|"around"|"beyond"|"aside"|"sideways"|"back"|"over"|"all over"
|"over there"|"over here"|"right here"|"right there"|"up here"|"down here"|"up"|"down") {return new Symbol(sym.AdvLugar, yychar, yyline,yytext()); }

("some"|"any"|"much"|"many"|"a little"|"a few"|"almost"|"enough"|"a lot"|"entirely"|"fairly"|"hasrdly"|"lots"|"less"
|"more"|"rather"|"scarcely"|"so"|"too"|"very"|"way") {return new Symbol(sym.AdvCantidad, yychar, yyline,yytext()); }

("slowly"|"easily"|"carefully"|"simply"|"happily"|"naturally"|"well"|"fast"|"hard"|"badly"|"worse"|"separately"|"carelessly"
|"wrong") {return new Symbol(sym.AdvModo, yychar, yyline,yytext()); }

("certainly"|"clearly"|"indeed"|"naturally"|"obviously"|"of course"|"surely"|"yes"|"exactly") {return new Symbol(sym.AdvAfirmacion, yychar, yyline,yytext()); }

("no"|"none"|"never"|"neither"|"not"|"not at all") {return new Symbol(sym.AdvNegacion, yychar, yyline,yytext()); }

("perhaps"|"maybe"|"probably") {return new Symbol(sym.AdvDuda, yychar, yyline,yytext()); }

("aboard"|"about"|"above"|"according to"|"across"|"after"|"against"|"ahead of"|"along"|"alongside"|"amid"|"amidst"
|"among"|"amongst"|"around"|"as"|"as far as"|"as from"|"as of"|"as regards"|"aside from"|"astride"|"at"|"at the bottom of"|"at the top of"
|"athwart"|"atop"|"away from"|"barring"|"because of"|"before"|"behind"|"below"|"beneath"|"beside"|"between"|"betwixt"|"beyond"|"but"
|"by"|"by means of"|"crica"|"concerning"|"close to"|"despite"|"down"|"due to"|"during"|"except"|"except for"|"excluding"|"failing"
|"far from"|"fro"|"for the purpose of"|"from"|"in"|"in addition to"|"in front of"|"inside"|"into"|"next"|"near"|"of"|"out"|"outside"
|"over"|"since"|"to"|"up") {return new Symbol(sym.preposiciones, yychar, yyline,yytext()); }

("and"|"not only"|"but also"|"but"|"as well"|"both"|"than"|"no sooner") {return new Symbol(sym.CC_Copulativas, yychar, yyline,yytext()); }

("but"|"however"|"nonetheless"|"nevertheless"|"yet"|"even so"|"still"|"inatead"|"on the contrary") {return new Symbol(sym.CC_Adversativas, yychar, yyline,yytext()); }

("as soon"|"as"|"already"|"here"|"there"|"these"|"those"|"or good") {return new Symbol(sym.CC_Distributivas, yychar, yyline,yytext()); }

("or"|"either"|"neither"|"nor"|"whether or"|"or else"|"otherwise") {return new Symbol(sym.CC_Disyuntivas, yychar, yyline,yytext()); }

("that is to say"|"rather"|"it's more"|"that is"|"this is") {return new Symbol(sym.CC_Explicativas, yychar, yyline,yytext()); }

("if"|"whenever"|"as long as"|"whatever") {return new Symbol(sym.CS_Condicionales, yychar, yyline,yytext()); }
("anymore because"|"it because"|"because"|" sice i") {return new Symbol(sym.CS_Casuales, yychar, yyline,yytext()); }
("then"|"so"|"that it"|"in this way"|"therefore") {return new Symbol(sym.CS_Consecutivas, yychar, yyline,yytext()); }
("even if"|"by more then") {return new Symbol(sym.CS_Concesivas, yychar, yyline,yytext()); }
("than"|"to"|"like"|"as well") { return new Symbol(sym.Cs_Comparativas, yychar, yyline,yytext()); }
("so that"|"to") {return new Symbol(sym.CS_Finales, yychar, yyline,yytext()); }

("going to") {return new Symbol(sym.AuxGoing, yychar, yyline,yytext()); }
("will"|"won´t"|"will not") {return new Symbol(sym.AuxWill, yychar, yyline,yytext()); }
("do"|"does"|"did") {return new Symbol(sym.AuxDo, yychar, yyline,yytext()); }
(","|"."|":"|";") {return new Symbol(sym.SigPunt, yychar, yyline,yytext()); }

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}