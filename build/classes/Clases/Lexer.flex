package Clases;
import static Clases.Tokens.*;
%%
%class Lexer
%type Tokens
espacio=[ ,\t,\r]
%{
  
    public String lexeme;
%}


%%

{espacio} {/*Ignore*/}
("battery"|"bed"|"bicycle"|"bird"|"book"|"bottle"|"boyfriend"|"brother building"|
"bulb"|"car"|"cat"|"chair"|"charger"|"cloud"|"contry"|"county"|"guatemala"|"cyclist"|"
day"|"year"|"month"|"week"|"desk"|"disk"|"dog"|"dress"|"earphone"|"ring"|"face"|"father"|"
field"|"finger"|"flower"|"folder"|"food"|"football"|"frog"|"girlfriend"|"glass"|"glasses"|"
glove"|"grandfather"|"grandmother"|"grocery"|"guitar"|"hand"|"high school"|"home"|"horse"|"
house"|"intelligence"|"justice"|"key"|"keyboard"|"letter"|"light"|"lion"|"love"|"memory"|"
mother in law"|"father in law"|"sister in law"|"brother in law"|"mouth"|"movie"|"movies"|"
music"|"song"|"necjlace"|"newspaper"|"news"|"breaking news"|"notebook"|"class"|"classmate"|"
teacher"|"pain"|"pencil"|"picture"|"photo"|"camera"|"food"|"apple"|"cellphone"|"pineapple"|"
potato"|"rain"|"road"|"sadness"|"sea"|"seat"|"ship"|"shoes"|"sister"|"sky"|"son"|"sock"|"sound"|"
store"|"street"|"table"|"theatre"|"think"|"tie"|"tiger"|"tomato"|"tooth"|"theeth"|"town"|"watch"|"
water"|"wine"|"bear"|"bee"|"honey"|"bird"|"internet"|"video"|"videogames"|"computer"|"daniel"|"douglas"
|"byron"|"cristopher"|"mynor"|"jeans"|"shirt"|"money"|"clouth"|"bus"|"spider"|"man"|"woman"|"men"|"women"|
"backpack"|"pack"|"controller"|"crown"|"air"|"ocean"|"city"|"america"|"central america"|"europe"|"asia"|"
africa"|"covid-19"|"minutes"|"hours"|"days"|"seconds") {lexeme=yytext(); return Sustantivos;}

//Adjetivos
 ("my"|"your"|"his"|"her"|"its"|"our"|"their") {lexeme=yytext(); return AdPosesivos;}

("that"|"this"|"these"|"those") {lexeme=yytext(); return AdDemostrativos;}

("honest"|"intelligent"|"optimistic"|"brave"|"friendly"|"tolerant"|"sensible"|"generous"|"responsible"|"hard-working"
|"adorable"|"dishonest"|"foolish"|"pessimistic"|"coward"|"rude"|"intolerant"|"senseless"|"selfish"|"irresponsible"|"lazy"|"detestable"
|"big"|"huge"|"heavy"|"thick"|"high"|"tall"|"deep"|"small"|"tiny"|"light"|"thin"|"low"|"short"|"superficial"|"old"|"modern"|"updated"
|"slow"|"future"|"cold"|"warm"|"hot"|"cool"|"beautiful"|"clean"|"elegant"|"chubby"|"pretty"|"attractive"|"horrible"|"dirty"|"informal"
|"skinny"|"ugly"|"unattractive"|"red"|"yellow"|"blue"|"pink"|"brown"|"green"|"orange"|"purple"|"black"|"white"|"gray"|"crazy"|"sick"
|"drunk"|"asleep"|"hungry"|"energetic"|"dead"|"open"|"single"|"sane"|"healthy"|"sober"|"awake"|"full"|"tired"|"alive"|"closed"|"married"
|"hard"|"rough"|"solid"|"wet"|"slippery"|"soft"|"smooth"|"liquid"|"dry"|"sticky"|"happy"|"angry"|"proud"|"grumpy"|"jealous"|"scary"
|"sad"|"calm"|"embarrassed"|"nice"|"faithful"|"peaceful") {lexeme=yytext(); return AdCalificativos;}

("one"|"two"|"three"|"four"|"five"|"six"|"seven"|"eight"|"nine"|"ten"|"eleven"|"twelve"|"thirteen"|"fourteen"|"fifteen"
|"sixteen"|"seventeen"|"eighteen"|"nineteen"|"twenty"|"thirty"|"fourty"|"fifty"|"sixty"|"seventy"|"eighty"|"ninety"|"hundred"
|"one hundred"|"two hundred"|"one thousand"|"ten thousand"|"million"|"one million") {lexeme=yytext(); return AdNumCardinal;}

("first"|"second"|"third"|"fourth"|"fifth"|"sixth"|"seventh"|"eighth"|"ninth"|"tenth"|"eleventh"|"twelfth"|"thirteenth"
|"fourteenth"|"fifteenth"|"sixteenth"|"seventeenth"|"eighteenth"|"nineteenth"|"twentieth"|"thirtieth"|"forieth"|"fiftieth"|"sixtieth"
|"seventieth"|"eightieth"|"ninetieth"|"one hundredth"|"one millionth") {lexeme=yytext(); return AdNumOrdinal;}

("some"|"few"|"less"|"bad"|"ill"|"far"|"good"|"well"|"late"|"little"|"many"|"much"|"one"|"other"|"others"|"such"|"both") {lexeme=yytext(); return AdIndefinidos;}

//ARTICULOS
 "the" {lexeme=yytext(); return ArtDefinidos;}
 ("an"|"a") {lexeme=yytext(); return ArtIndefinidos;}

//Pronombres
"I" {lexeme=yytext(); return PronI;}
("i"|"you"|"she"|"he"|"it") {lexeme=yytext(); return PronPerSingulares;}
 ("we"|"they"|"you") {lexeme=yytext(); return PronPerPlurales;}
("i"|"you"|"she"|"he"|"it"|"they"|"we") {lexeme=yytext(); return PronPer;}
 ("this"|"that"|"these"|"those"|"none"|"one"|"ones"|"such") {lexeme=yytext(); return PronDemostrativos;}
 ("where"|"when"|"why"|"how"|"who"|"whose"|"what"|"which") {lexeme=yytext(); return PronInterrogativos;}

//verbo to be
"am" {lexeme=yytext(); return VerbAm;}
"was" {lexeme=yytext(); return VerbWas;}
"were" {lexeme=yytext(); return VerbWere;}
"is" {lexeme=yytext(); return VerbIs;}
"are" {lexeme=yytext(); return VerbAre;}
"be" {lexeme=yytext(); return VerbBe;}
"being" {lexeme=yytext(); return VerbBeing;}

//VERBOS REGULARES
("accept"|"add"|"admit"|"allow"|"agree"|"answer"|"arrive"|"appear"|"ask"|"believe"|"belong"|"brush"|"call"|"cancel"
|"change"|"clean"|"close"|"complain"|"complete"|"cook"|"copy"|"count"|"cry"|"dance"|"decide"|"decorate"|"destroy"|"drop"|"dry"|"enjoy"
|"excape"|"explain"|"finish"|"fix"|"follow"|"guess"|"happend"|"hate"|"help"|"imagine"|"improve"|"increase"|"invent"|"invite"|"join"
|"jump"|"kill"|"kiss"|"laugh"|"learn"|"like"|"listen"|"live"|"look"|"love"|"measure"|"mention"|"need"|"notice"|"offer"|"open"|"order"
|"organize"|"paint"|"place"|"pay"|"please"|"practice"|"prepare"|"qualify"|"rain"|"recieve"|"remember"|"remind"|"repeat"|"report"
|"require"|"return"|"search"|"sign"|"smile"|"start"|"stop"|"study"|"talk"|"touch"|"translate"|"travel"|"try"|"use"|"visit"|"wait"|"walk"
|"want"|"watch"|"wish"|"work"|"worry"|"act"|"beg"|"belong"|"charge"|"dress"|"die"|"hope"|"miss"|"marry"|"prefer"|"promise"|"study"
|"smoke"|"thank"|"touch"|"wash"|"wish") {lexeme=yytext(); return VerbosRegPresent;}

("accepting"|"adding"|"admiting"|"allowing"|"agreeing"|"answering"|"arriving"|"appearing"|"asking"|"believing"|"belonging"|"brushing"|"calling"|"canceling"
|"changing"|"cleaning"|"closing"|"complaining"|"completing"|"cooking"|"copying"|"counting"|"crying"|"dancing"|"deciding"|"decorating"|"destroying"|"droping"|"drying"|"enjoying"
|"excaping"|"explaining"|"finishing"|"fixing"|"following"|"guessing"|"happending"|"hating"|"helping"|"imagining"|"improving"|"increasing"|"inventing"|"inviting"|"joining"
|"jumping"|"killing"|"kissing"|"laughing"|"learning"|"likeing"|"listening"|"living"|"looking"|"loveing"|"measureing"|"mentioning"|"needing"|"noticeing"|"offering"|"opening"|"ordering"
|"organizing"|"painting"|"placing"|"paying"|"pleasing"|"practicing"|"preparing"|"qualifying"|"raining"|"recieving"|"remembering"|"reminding"|"repeating"|"reporting"
|"requiring"|"returning"|"searching"|"signing"|"smiling"|"starting"|"stoping"|"studying"|"talking"|"touching"|"translating"|"traveling"|"trying"|"using"|"visiting"|"waiting"|"walking"
|"wanting"|"watching"|"wishing"|"working"|"worrying"|"acting"|"beging"|"belonging"|"charging"|"dressing"|"dying"|"hoping"|"missing"|"marrying"|"prefering"|"promising"|"studying"
|"smoking"|"thanking"|"touching"|"washing"|"wishing") {lexeme=yytext(); return VerbosRegIng;}

("accepted"|"added"|"admited"|"allowed"|"agreed"|"answered"|"arrived"|"appeared"|"asked"|"believed"|"belonged"|"brushed"|"called"|"canceled"
|"changed"|"cleaned"|"closed"|"complained"|"completed"|"cooked"|"copied"|"counted"|"cried"|"danced"|"decided"|"decorated"|"destroyed"|"dropped"|"dryed"|"enjoyed"
|"excaped"|"explained"|"finished"|"fixed"|"followed"|"guessed"|"happended"|"hated"|"helped"|"imagined"|"improved"|"increased"|"invented"|"invited"|"joined"
|"jumped"|"killed"|"kissed"|"laughed"|"learned"|"liked"|"listened"|"lived"|"looked"|"loved"|"measured"|"mentioned"|"needed"|"noticed"|"offered"|"opened"|"ordered"
|"organized"|"painted"|"placed"|"payed"|"pleased"|"practiced"|"prepared"|"qualifyed"|"rained"|"recieved"|"remembered"|"reminded"|"repeated"|"reported"
|"required"|"returned"|"searched"|"signed"|"smiled"|"started"|"stopped"|"studyed"|"talked"|"touched"|"translated"|"traveled"|"tryed"|"used"|"visited"|"waited"|"walked"
|"wanted"|"watched"|"wished"|"worked"|"worried"|"acted"|"beged"|"belonged"|"charged"|"dressed"|"died"|"hoped"|"missed"|"married"|"prefered"|"promised"|"studied"
|"smoked"|"thanked"|"touched"|"washed"|"wished") {lexeme=yytext(); return VerbRegPast;}

 ("arise"|"awake"|"bear"|"beat"|"become"|"begin"|"bend"|"bet"|"bid"|"bind"|"bite"|"bleed"|"blow"|"break"|"breed"|"bring"
|"build"|"burn"|"burst"|"buy"|"cast"|"catch"|"choose"|"cling"|"come"|"cost"|"creep"|"cut"|"deal"|"dig"|"do"|"draw"|"dream"|"drink"
|"drive"|"eat"|"fall"|"feed"|"feel"|"fight"|"find"|"flee"|"fly"|"forbid"|"forget"|"forgive"|"freeze"|"get"|"give"|"go") {lexeme=yytext(); return VerbosIrregPresent;}


("arising"|"awaking"|"bearing"|"beating"|"becoming"|"begining"|"bending"|"beting"|"biding"|"binding"|"biteing"|"bleeding"|"blowing"|"breaking"|"breeding"|"bringing"
|"building"|"burning"|"bursting"|"buying"|"casting"|"catching"|"choosing"|"clinging"|"coming"|"costing"|"creeping"|"cuting"|"dealing"|"digging"|"doing"|"drawing"|"dreaming"|"drinking"
|"driving"|"eating"|"falling"|"feeding"|"feeling"|"fighting"|"finding"|"fleeing"|"flying"|"forbiding"|"forgeting"|"forgiving"|"freezing"|"geting"|"giving"|"going") {lexeme=yytext(); return VerbIrregIng;}


("arose"|"awoke"|"bore"|"beat"|"became"|"began"|"bent"|"bet"|"bid"|"bound"|"bit"|"bled"|"blew"|"broke"|"bred"|"brought"
|"built"|"burnt"|"burst"|"bought"|"cast"|"caught"|"chose"|"clung"|"came"|"cost"|"crept"|"cut"|"dealt"|"dug"|"did"|"drew"|"dreamt"|"drank"
|"drove"|"ate"|"fell"|"fed"|"felt"|"fought"|"found"|"fled"|"flew"|"forbade"|"forgot"|"forgave"|"froze"|"got"|"gave"|"went") {lexeme=yytext(); return VerbIrregPast;}




//Adverbios
("early"|"late"|"earlier"|"later"|"then"|"before"|"after"|"afterwards"|"now"|"nowadays"|"these days"|"currently"|"at present"
|"today"|"tomorrow"|"yesterday"|"still"|"already"|"yet"|"no yet"|"no longer"|"just"|"ever"|"soon"|"again"|"thereafter"|"lately"
|"recently"|"formerly"|"latterly"|"in the past"|"in the future"|"this week"|"next week"|"last week"|"this year"|"last year"|"next year"
|"meanwhile"|"someday"|"shortly"|"ago") {lexeme=yytext(); return AdvTiempo;}

("here"|"there"|"near"|"nearby"|"far"|"away"|"home"|"abroad"|"in"|"out"|"inside"|"outside"|"indoors"|"outdoors"|"above"
|"below"|"underneath"|"beneath"|"ahead"|"behind"|"in front"|"oppsite"|"around"|"beyond"|"aside"|"sideways"|"back"|"over"|"all over"
|"over there"|"over here"|"right here"|"right there"|"up here"|"down here"|"up"|"down") {lexeme=yytext(); return AdvLugar;}

("some"|"any"|"much"|"many"|"a little"|"a few"|"almost"|"enough"|"a lot"|"entirely"|"fairly"|"hasrdly"|"lots"|"less"
|"more"|"rather"|"scarcely"|"so"|"too"|"very"|"way") {lexeme=yytext(); return AdvCantidad;}

("slowly"|"easily"|"carefully"|"simply"|"happily"|"naturally"|"well"|"fast"|"hard"|"badly"|"worse"|"separately"|"carelessly"
|"wrong") {lexeme=yytext(); return AdvModo;}

("certainly"|"clearly"|"indeed"|"naturally"|"obviously"|"of course"|"surely"|"yes"|"exactly") {lexeme=yytext(); return AdvAfirmacion;}

("no"|"none"|"never"|"neither"|"not"|"not at all") {lexeme=yytext(); return AdvNegacion;}

("perhaps"|"maybe"|"probably") {lexeme=yytext(); return AdvDuda;}
 
//Preposiciones
("aboard"|"about"|"above"|"according to"|"across"|"after"|"against"|"ahead of"|"along"|"alongside"|"amid"|"amidst"
|"among"|"amongst"|"around"|"as"|"as far as"|"as from"|"as of"|"as regards"|"aside from"|"astride"|"at"|"at the bottom of"|"at the top of"
|"athwart"|"atop"|"away from"|"barring"|"because of"|"before"|"behind"|"below"|"beneath"|"beside"|"between"|"betwixt"|"beyond"|"but"
|"by"|"by means of"|"crica"|"concerning"|"close to"|"despite"|"down"|"due to"|"during"|"except"|"except for"|"excluding"|"failing"
|"far from"|"fro"|"for the purpose of"|"from"|"in"|"in addition to"|"in front of"|"inside"|"into"|"next"|"near"|"of"|"out"|"outside"
|"over"|"since"|"to"|"up") {lexeme=yytext(); return preposiciones;}

//conjunciones coordinantes
("and"|"not only"|"but also"|"but"|"as well"|"both"|"than"|"no sooner") {lexeme=yytext(); return CC_Copulativas;}
("but"|"however"|"nonetheless"|"nevertheless"|"yet"|"even so"|"still"|"inatead"|"on the contrary") {lexeme=yytext(); return CC_Adversativas;}
("as soon"|"as"|"already"|"here"|"there"|"these"|"those"|"or good") {lexeme=yytext(); return CC_Distributivas;}
("or"|"either"|"neither"|"nor"|"whether or"|"or else"|"otherwise") {lexeme=yytext(); return CC_Disyuntivas;}
("that is to say"|"rather"|"it's more"|"that is"|"this is") {lexeme=yytext(); return CC_Explicativas;}
 
//Conjunciones subordinales
("if"|"whenever"|"as long as"|"whatever") {lexeme=yytext(); return CS_Condicionales;}
("anymore because"|"it because"|"because"|" sice i") {lexeme=yytext(); return CS_Casuales;}
("then"|"so"|"that it"|"in this way"|"therefore") {lexeme=yytext(); return CS_Consecutivas;}
("even if"|"by more then") {lexeme=yytext(); return CS_Concesivas;}
("than"|"to"|"like"|"as well") {lexeme=yytext(); return CS_Concesivas ;}
("so that"|"to") {lexeme=yytext(); return CS_Finales;}

//AUXILIARES
"going to" {lexeme=yytext(); return AuxGoing;}
("will"|"won´t"|"will not") {lexeme=yytext(); return AuxWill;}
("do"|"does"|"did") {lexeme=yytext(); return AuxDo;}

//SIGNOS DE PUNTUACION
(","|"."|":"|";") {lexeme=yytext(); return SigPunt;}

 . {return ERROR;}
"\n" {lexeme=yytext(); return Linea;}