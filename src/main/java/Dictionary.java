import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



import com.google.common.base.Strings;

//Basit enum uygulaması
//Aykan A. 19/02/2021


public enum Dictionary {

    /* Data to be stored in dictionary */
    KOVA("Kova", "21.1", "18.2", "Hava", "Sabit", "Satürn", "Mavi,Yeşil", "Akuamarin", "Cumartesi",
            "Arkadaş ve dost canlısı, sosyal, yenilikçi, sıradışı, marjinal",
            " Evcimen olmaktan ziyade dışarıda bir hayatı tercih eden, arkadaşlıkları aileden önce gelen, farklı ve sıradışı erkeklerdir."
                    + " Zeka ve akılcılıkları ile yol gösterirler, vizyoner bakış açılarıyla yaşadıkları topluma etki ederler. ",
            " Farklıdır, sıradışıdır, zekidir. Ona ayak uydurmak çok da kolay değildir, bulunduğu ortamla uyumunu kendi yaratır."
                    + " Oldukça sosyal ve arkadaş canlısı olsalar da eş seçimleri zordur. Teknolojik cihaz ve araçlar vazgeçilmezleridir.",
            "Orijinal ve yenilikçi tasarımlar, en yeni ve ultramodern çizgiler, tekonolojiyi çağrıştıran detaylar ve "
                    + "aksesuarlar, çağının ötesinde giyim anlayışı, çılgın ve sıradışı kıyafetler",
            "Ayak bileği, kan dolaşımı", "İkizler, Terazi, Aslan", "Yengeç, Boğa, Koç",
            "İnsancıl, öğretici, özgürlükçü, yenilikçi, modern, farklı, sıradışı, zeki, akıllı, tarafsız, sosyal",
            "Asi ruhlu, başkaldıran, huzursuz, iğneleyici , sert çıkışlar yapabilen, duygusuz görünebilen",
            "Bir Kova burcu sevgiliniz veya eşiniz varsa onu arkadaşlarıyla, sosyal çevresiyle, öğrencileriyle ve fanlarıyla paylaşmaya hazır olmalısınız."
                    + " Zira çevresinde aynı fikir ve görüşleri paylaştığı arkadaşları, dostları ve sosyal grupları vardır."
                    + "\n Sadece benim olsun veya baş başa kalalım düşüncelerinden vazgeçmeniz gerekebilir. Üstelik çok da tarafsızdır."
                    + " Başka birinin haklı olduğunu düşünüyorsa, canı da olsanız hatta üzüleceğinizi de bilse sizi savunmaz."
                    + "\n Buna karşın çok hümanisttir, duygularını göstermese de aslında sizi korur, kollar ve görünmez bir el gibi yanınızdadır."
                    + " Günün sonunda ondan yanlış bir şey görmezsiniz. Kendini olduğu kadar karşısındaki kişiyi de zamanın ötesine ve ileriye taşımaya çalışır, görüş ve"
                    + "\n fikirleriyle umut verir, aydındır ve aydınlatmayı ister. Özgürlüğünü kısıtlamaya, işine müdahale etmeye ise asla çalışmayın,"
                    + " o zaman gerçekten kırıcı olabilir. Görüşlerine karşı geliyorsanız elinizde gerçekten sağlam delil ve dayanaklarınız olmalıdır.",
            "Duygularını göstermez, onun için çocuğunun eğitimi ve en iyi şekilde yetişmesi her türlü duygusal ihtiyacının önünde gelir."
                    + "\n Zira çocuğu ailesine, toplumuna, vatanına yararlı, ayakları sağlam yere basabilen, tek başına varolabilen bir birey olmalıdır."
                    + " Sosyal bir annedir ve çevresinde her zaman arkadaşları vardır. Sizi düşündüğü kadar başkalarını da düşünür, insan canlısıdır."
                    + "\n Ancak çocuğuna karşı her zaman takiptedir, uzaktan izler ve gerektiği anda derhal müdahale etmesini bilir.",
            "Olgun, yaş almış, deneyimli bir babadır. Ondan çok şey öğrenebilirsiniz. Aydınlıktır ve hümanisttir."
                    + "\n Çevresinde her daim sosyal grupları, arkadaşları vardır. Zira hümanisttir, ileri görüşlüdür, çağdaş ve modern düşüncededir."
                    + " İşinde başarılı olduğu kadar toplumsal alanda da başarılı olmak ister. Onun için de çocuğunun iyi eğitim görmesi ve bir birey olarak yetişmesi çok önemlidir."
                    + "\n Özgürlükçü bir babadır, kısıtlamaz ancak çocuğunu gözler, gözetir ve gerektiğinde akılcı ve yapıcı müdahalelerde bulunur.",
            "Her şeyden önce ilginç ve sıradışı bir çocuktur. Çok zekidir, evinizdeki küçük dahi olabilir, zira bilime, buluşlara, icatlara meraklıdır."
                    + " Oyuncaklarını parçalara ayırıp, yeniden birleştirmek, bunu yaparken değişik, farklı şeyler denemek ister. Bilgiye, öğrenmeye her zaman açtır."
                    + " Arkadaşlarıyla birlikte olmayı, paylaşmayı çok sever, sosyal bir çocuktur. Uçuk, kaçık şeyler deneyebilir, çılgın fikirleri olabilir."),

    BALIK("Balık", "19.2", "20.3", "Su", "Jupiter", "Satürn", "Beyaz, lavanta", " Ay taşı", "Perşembe",
            "Hassas, duyarlı, empatik, vicdanlı, duyarlı, sanatsal, hayırsever, yardımsever, kolay etkilenen",
            " Etrafında olan biten her şeyden ve etrafındaki herkesten kolayca etkilenebilen hassas kişilerdir."
                    + "\n Tam olarak anlaşılamayan, kendilerini de belirli kalıplar içinde tanımlayamayan muğlak, gizemli, karmaşık yönleri vardır."
                    + " Şiire ve müziğe yatkın, romantik erkeklerdir. ",
            "Masalsı, büyüleyici bir güzelliğe sahip olabilir. Gözleri anlamlı, derin ve oldukça etkileyicidir."
                    + " Sinema aktrisi havasında olabilir. Giyinmeye, makyaja meraklıdır."
                    + "\n Hassas ve alıngandır ancak her ne kadar fazlaca etki altında kalsa da bir şekilde zor durumlardan sıyrılmasını, kurtulmasını bilir. Akışta yaşar.",
            "Şekli, tarzı ve kesimi çok belli olmayan giysiler, açık renkler, beyaz kıyafetler, romantik, şairane giysiler, buğulu, belirsiz, karmaşık görünümü tamamlayan aksesuarlar",
            "Ayaklar", "Başak, Akrep, Yengeç", "Kova, Oğlak, Koç",
            "Fedakar, cefakar, duygusal, sezgisel, merhametli, sanatçı ruhlu, hassas, inançlı, mistik",
            "Zayıf, hassas, kırılgan, mağdur, sulugöz, dağınık, kolay yönlendirilebilen, tutarsız, bağımlı",
            "Balık burcu bir sevgiliniz varsa arkasını toplamanız gerekebilir. Zira tüm dış etkilere açıktır, herkese acır, herkes için bir şeyler yapmak ister, kendini kolayca feda edebilir."
                    + "\n İyi niyeti ve vicdanı başkaları tarafından kolayca kötüye kullanılabilir."
                    + " Ondan beklentisi olan etrafında çok fazla kişi vardır. Duygusal ve fiziksel dağınıklığını toplamak, onu maddi dünyayla buluşturmak size kalabilir."
                    + "\n Bu durum sizi aşırı yorsa da onun romantizmi, şiirleriyle, bestelediği, söylediği müzikle, yaptığı resimlerle kendinizden geçebilirsiniz."
                    + " Size çok ulvi ve evrensel bir dünyanın kapılarını açabilir. Ancak ayaklarınızın yere sağlam bastığından her zaman emin olabilirsiniz."
                    + " Zira aksi halde derin bir uyku, uyuşukluk durumuna geçebilir, olayların akışına siz de kapılıp gidebilirsiniz",
            "Oldukça hisli ve duygusal bir annedir. Gözyaşları sizin için akmaya her zaman hazırdır. Kendini sizin için feda edebilir, her türlü ihtiyacınızı karşılamak için kendinden vazgeçebilir."
                    + "\n Bu durum suçluluk duymanıza yol açabilir. Annenizin hassaslığı ve kırılganlığı onun dış etkilere, başka kişilere ve hastalıklara karşı da zayıf kılar."
                    + " Her zaman yanında ve arkasında olmanız gerekebilir.",
            "Kendisini ailesi ve çocukları için feda edebilir. Onların refahı ve mutluluğu için zarar görsün veya görmesin her şeyi yapmaya hazır ve nazırdır."
                    + "\n Kurban durumuna düşebilir, hastalıklara karşı meyilli olabilir. Ailesine karşı vicdanı ve merhameti sonsuzdur.",
            "Balık burcu bir çocuğunuz varsa hassas, kırılgan, hastalıklara, alerjilere meyilli bünyesine karşı her daim tetikte olmalısınız."
                    + "\n Hassas ve duyarlı ruhunu sanata, müziğe, resme yönlendirebilirsiniz. Sezgileri, mistik yanı oldukça güçlüdür. Geniş ve zengin bir hayalgücü vardır, oldukça fazla ve etkili rüyalar görebilir."),

    KOC("Koç", "21.3", "20.4", "Ateş", "Öncü", "Mars", "Kırmızı", "Elmas", "Salı",
            "Aktif, dinamik, insiyatif sahibi, hızlı, lider, yönetici",
            "Bir komutan edasında olabilir ve yönetme arzusu ruhunda vardır. Hızlıdır, bir süreci tamamladığında diğerine geçmekte zorlanmaz ancak her şeyi çabuk tüketen ve çabuk sıkılan bir yapıya sahiptir. Sakin ve sabırlı bir eş veya ortak ararlar.  ",
            "Erkeksi özelliklere sahip, güçlü ve mücadeleci kadınlardır. Harekete geçmekten korkmaz, cesur ve girişimcidir. Ne istediğini bilir ve hızla kavuşmak ister. Sabırsız ve aceleci özellikleri hata yapmasına neden olabilir.",
            "Canlı renkler, cesur kıyafetler, erkeklerde sert ve maço, kadınlarda ise erkeksi ancak seksi giysiler",
            "Baş ve Yüz", "Aslan, Yay, Terazi", "Oğlak, Kova, Balık",
            "Hızlı, girgin, rekabetçi, gözüpek, mert, güçlü, hevesli, kararlı, inatçı, çalışkan",
            "Sabırsız, çocuksu, aceleci, tezcanlı, bağımsız, sert, açıksözlü",
            "Koç burcu ilişkilerinde herşeyden önce samimiyet ve dürüstlük arar. Yalandan, dolandan, dolambaçlı, karmaşık yollardan asla hoşlanmaz. Düşündüğünü olduğu gibi söyler, kırıcı olabileceğini hiç düşünmez. Göründüğü gibidir, yanıltmaz. İlişkilerde hızdan, çabuk sonuç almaktan hoşlanır. Olmayacağını anladığında kararını hemen verir, bir sonraki ilişkisine geçer. Meydan okumaktan ve rekabetten hoşlanır.",
            "Duygularını göstermekte zorlanır, duygusallık sergilemekten hoşlanmaz, kaçınır. Ancak eğlenceli, canlı, enerjik, oyuncu bir annedir. Çocuğuyla kısa ancak kaliteli zaman geçirmesini bilir. Çalışmaktan çocuğuna ayıracak zaman bulamayabilir.",
            "Şen, şakrak, eğlencelidir. Kız çocuklarının gözdesidir. Oğullarıyla futbol, konsol oyunlar vb her şeyi oynayabilir. İşkolik olabilir. Fazlasıyla açıksözlü olması, düşündüğünü olduğu gibi söylemesi çocuk kalbine sert gelebilir.",
            "Anne, babasını epeyce yorabilir. Ancak zekidir, muziptir, şeytan tüyü vardır. Fiziksel aktivitelere meraklıdır. Arkasından epeyce koşturabilir. Korkusuz, temkinsiz, sabırsız ve acelecidir."),
    BOGA("Boğa", "21.4", "21.5", "Toprak", "Sabit", "Venüs", "Toprak renkler, taba, bej, kahve, yeşil",
            "Zümrüt", "Cuma",
            "Güvenilir, rahatına, konforuna, yemeğe düşkün, gurme, harekete geçmekte zorlanan",
            "Güven ve sadakat önemlidir. Bir Boğa erkeğinin güvenini kazandıysanız sizden kolay kolay vazgeçmez. Süslü, bakımlı, makyajlı kadınlardan hoşlanır. Lüks, para ve maddiyat onun için önemlidir. ",
            "Giyinmekten, süslenmekten hoşlanan, her daim güzel görünmek isteyen, alımlı, bakımlı, güzel kadındır. İlişkilerinde güven çok önemlidir. Karşılığında sonsuz bir sadakat sunabilir. Para harcamayı, alışverişi sever ancak hesabını da bilir.",
            "Zarif, yumuşak, rahat giysiler, zengin, şık, kibar, oturaklı görünüm.", "Boyun, boğaz",
            "Başak, Akrep, Terazi", "Aslan, Kova, Yay",
            "Güvenilir, sadık, zevkli, gurme, sahiplenici, tutkulu, yaratıcı, estetik ve sanat yönü güçlü, uyumlu, lüks ve konfora düşkün, sağlıklı",
            "Ağır, inatçı, sabitfikirli, tutucu, bağımlı, keyifçi, yavaş ama sert öfkelenen",
            "Boğa burcu ilişkilerinde güven arar ve güvenli limanı bulduğunda kolay kolay vazgeçmez ve bırakmaz. Genellikle karşı tarafın bırakmasını veya hareket geçmesini yeğler. Fazlasıyla sabırsız veya hareketli biriyseniz, bir Boğa burcuyla birlikteliğiniz epey zor olabilir. Zira yavaşlıkları, ağırlıkları sizi çileden çıkarabilir. Ancak aradığınız huzur ve kararlılıksa ideal bir eş olabilir. Yemeğe oldukça düşkündür. Zengin sofralar, keyifli ortamlarla Boğa burcu eşinizi veya sevgilinizi şımartabilirsiniz.",
            "Çocuğuna gereken konforu, rahatlığı sağlamakta zorlanmaz. Toprakla, doğayla arası iyi olduğu için çocuğunu parklara, ormana, denize götürmeyi sever. Kız çocuklarını süslemeyi, erkek çocuklarını şık ve alımlı giydirmeyi sever.",
            "Güvenilir, sağlamcı bir babadır. Çocukların maddi ihtiyaçlarına karşı duyarlıdır, gereken parayı sağlamaya çalışır. Çocuklarına huzurlu, istikrarlı, sıcak bir yuva sunmak ister.",
            "Harekete geçirmek kolay değildir. Fiziksel aktivitelerde zorlanabilir ancak bir şeyi sevip karar kıldı mı asla vazgeçmez. Başladığı işi ve aktiviteyi sonuna dek götürmek ister. Oyunların başından almak, sevdiği, bağlandığı ortamdan koparmak oldukça zordur."),
    IKIZLER("Ikizler", "22.5", "21.6", "Hava", "Değişken", "Merkür", "Sarı, Turuncu", "Agat", "Çarşamba",
            "Esnek, uyumlu, çevik, konuşkan, meraklı, arkadaş canlısı",
            "Sevimli ve canayakındır. Beğendiği kişiyi güzel sözleri, akılcı konuşması, bilgi ve birikimiyle kolayca etkileyebilir. Gezmeyi, seyahati sever, hareketli, değişken bir hayatı tercih eder. Aşktan çabuk sıkılabilir, sadakat konusunda çok beklenti içinde olmamak gerekir, zira sürekli değişim arar hayatında. Zorlu durumlar karşısında pratik çözümleriyle yol göstericidir.",
            "Değişime herkesten çok ihtiyacı vardır. bulunduğu ortamda çabuk sıkılır, dışarı çıkmak, hava almak ister. Özgürlüğüne karışılmamalıdır. tatlı dilli ve konuşkandır. Dost canlısı yönü etrafında pek çok kişinin bulunmasını sağlar. Akıllı ve zekidir, ne istediğini çabuk bilir ve ona hızla ulaşmak için pratik yolları kolayca bulur.",
            "En son trendlere, yeniliklere meraklıdır. Kim ne giymiş, ne takmış, sürmüş onun için önemlidir. Değişken ruh haline göre zaman zaman çarpıcı giysilerden, renksiz veya göze çarpmayan giysilere kadar geniş bir gardırobu olabilir.",
            "Omuz, kollar, eller", "Terazi, Kova, Yay", "Oğlak, Yengeç, Boğa",
            "Meraklı, istekli, kıpır kıpır, zeki, akıllı, yetenekli, iletişimi güçlü, konuşmayı, yazmayı seven",
            "Sıkılgan, dağınık, huzursuz, dengesiz, güven telkin etmeyen, yüzeysel",
            "Çabuk sıkılır, kolay vazgeçer ve bırakır. Ancak zeki ve akıllıdır. Dolayısıyla doğru kişiyi bulduğuna aklen ve zihnen gerçekten kanaat getirdiğinde hızlı ve eliçabuk davranabilir. Ne yazık ki uzun ve ciddi ilişkiler de pek ona göre değildir. Değişkenliği ve esnekliği sever. Duygusallıktan haz etmez. Bilmek, öğrenmek, merakını gidermek, gezmek onun için önemlidir. Eşi veya partneri bu tarafını beslediği sürece sorun yoktur. Ancak bir kez sıkıldı mı, ilişkiye fiziken ve ruhen döndürmek zordur.",
            "Her şeyden önce çok iyi bir arkadaştır. Çocuğuna bir sürü şey öğretir. Her konuda ilgili, bilgili, meraklıdır. Çocuğuyla büyük insan gibi konuşabilir, her şeyi anlatabilir, dedikodu yapabilir.",
            " Ele avuca sığdırması ve anlaması zordur. Çocuk anlayıncaya kadar baba ya o alan veya konudan vazgeçmiş, ya da kendisine daha ilgi çekici başka bir meşgale bulmuştur. Ders çalıştırması zor olabilir, zira kendisi konsantre olamadığı gibi çocuğununkini bile bozabilir.",
            "Oldukça akıllı, problem çözücü, konuşkan, kıpır kıpırdır. Her şeye meraklıdır. Kapıları dinleyebilir. Zira her şeyi öğrenmek ve bilmek ister. Dikkatini toplaması, odaklanması güç olabilir. Zira envai çeşit ilgi alanı olabilir."),
    YENGEC("Yengeç", "22.6", "22.7", "Su", "Öncü", "Ay", "Mavi", "İnci", "Pazartesi",
            "Evine, annesine, ailesine, yurduna düşkün, duyarlı, hassas, yemeğe, sofraya meraklı, tarihsel konulara ilgili, müzik yeteneğine sahip",
            "Annesine ve eşine düşkün, evine bağlı erkeklerdir. Mutfaktan, yemek yapmaktan, güzel sofralardan keyif alır. Algısı yüksek, anlayışlı, şefkatli ve merhametlidir ancak bunu abarttığında boğucu gelebilir. ",
            "Güzel ve çekici kadınlardır, iyi bir eş ve anne olurlar, evlerinde zaman geçirmeyi, mutfakla ilgilenmeyi, yemek pişirmeyi ve yemeyi severler. Kadınlar, kadınsal konularla ve çocuklarla araları çok iyidir.",
            "Göğüs dekoltesini gösteren giysiler, yuvarlak kesimler, bol ve rahat elbiseler, yumuşak kumaşlar",
            "Göğüs, mide", "Akrep, Balık, Oğlak", "İkizler, Yay, Kova",
            "Şefkatli, korumacı, derin ve içten seven, aileye düşkün, duygusal, sezgisel, hassas, duyarlı, fedakar, cefakar",
            "Ağır, sessiz, kolay anlaşılamayan, kaygılı, endişeli, şüpheci",
            "Oldukça sulugöz olabilir, sorunları aşırı büyütebilir, ruh hali binbir değişiklik gösterebilir, fazlasıyla takıntılı olabilir. Sevgiliniz veya eşiniz Yengeç ise sabırlı olmanız gerek. Zira anlaması hiç de kolay olmadığı gibi, kendisi de konuşup anlatmak veya açıklamak istemez. Gereksiz yere endişe ve korkulara bakabilir. Endişe duyduğu konuyu açıklamanız için üstünüze gelebilir, oldukça boğucu olabilir. Annesine ve ailesine aşırı düşkün olabilir. Ancak bir Yengeç’in kollarında sırtınız asla yere gelmez. Sizi herkesten ve herşeyden koruyabilir, sevgi ve şefkatiyle sarıp sarmalayabilir.",
            "Şefkatli, duyarlı, ilgili, korumacı bir annedir. Yaptığı güzel ve sağlıklı yemeklerle beslenmeye oldukça önem verir. Ancak aşırı ilgili ve koruma çocuk için zaman zaman boğucu olabilir. Fazlasıyla sahiplenici olabilir.",
            "Duygusal, duyarlı, sezgileri oldukça güçlü bir babadır. Gerekli olduğunda, yeri geldiğinde annenin yerini alabilir, bir anne gibi şefkatli ve korumacı olabilir. Ailesi ve çocukları her şeyden önde gelir.",
            "Annesine ve ailesine oldukça düşkün bir çocuktur. Adeta ailesinin gözünün içine bakar. Bulunduğu ortamın, evin huzursuzluğu, dağınıklığı onu üzer, her şeyin yolunda gitmesi konusunda oldukça kaygılıdır zira. Mutlu ve sakin bir yuva ister."),
    ASLAN("Aslan", "23.7", "23.8", "Ateş", "Sabit", "Güneş", "Altın, Turuncu", "Yakut", "Pazar",
            "Özgüvenli, gururlu, mağrur, koruyan, kollayan, gösterişli, sanata, estetiğe düşkün",
            "Gururnun okşanmasından, hizmet görmekten, pohpohlanmaktan hoşlanır. Ne kadar şık ve yakışıklı olduğunu sıkça tekrarlamanız gerekebilir. Baba olmak için doğmuştur, kendisi baba olmasa da korumacı ve kollayıcı özellikleriyle baba rolü üstlenebilir.",
            "Giyinmeye, süslenmeye meraklıdır. Girdiği ortamlarda kıyafet, aksesuar ve saçlarıyla hemen dikkatleri üzerine çeker. Sahne duruşu ve yürüyüşüne sahiptir. Gururunu kıracak herhangi bir söz ve davranıştan özellikle sakınmanız gerekir. ",
            "Gösterişli, frapan giysiler, canlı renkler, iddialı kesimler, parlak aksesuarlar, taçlar, mücevherler",
            "Kalp", "Yay, Koç, Kova", "Akrep, Oğlak, Yengeç",
            "Kollayıcı, cömert, alçakgönüllü, mağrur, gururlu, onurlu, yaratıcı, neşeli, oyuncu, karizmatik, romantik",
            "Hükmetmeyi seven, tutucu, pohpohlanma bekleyen, abartılı, her şeyi çok kişisel algılayabilen, sabit, inatçı",
            "Aslan şövalye ruhu taşır, sevdiği kişiyi her ne pahasına olursa olsun korur ve kollar, kimse sevdiğini onun gözünde küçültemez, aşağılayamaz, hemen karşılığını verir. Ne kendini ezdirir, ne de karşısındakinin ezilmesine tahammül edebilir. Bir Aslan sevgiliniz ve eşiniz varsa siz de güçlü olmalısınız. Sahiplenmeyi de sahiplenilmeyi de sever. Gururu herşeyin önünde gelir, asla gururunu zedeleyici bir girişimde bulunmamalısınız. Aşkta oldukça coşkulu, yaratıcıdır, sınır tanımaz. Özgüveni oldukça yüksektir, şımartılmaktan, pohpohlanmaktan çok hoşlanır ancak samimi olmalısınız. Cömerttir, neşeli ve candandır ancak benlik duygusu çok güçlüdür, kendinizi ezdirmemelisiniz.",
            "Çocuklarını her daim korur, kollar, gözetir. Ancak duygusallık ve şefkatlikten ziyade uzaktan müdahale etmeyi sever. Gururu, özgüveni ve inadı yüksektir, sitem etmeyi sever. Kendini çocuklarının üzerinde görebilir. Aslan annenizi mutlu etmek için sürekli onu öven, güzel sözler söylemelisiniz.",
            "Keyiflere, eğlenceye, yeme içmeye, neşeli ortamlara düşkündür. Oyuncudur, çocuklarıyla da oynamayı ve eğlenmeyi sever. Çocuklarından kayıtsız şartsız itaat bekleyebilir. Övünmeyi, gururlanmayı sever. Çocuklarının başarısı onlar için büyük bir övünç kaynağıdır, gösterişli şekilde abartmaya meraklıdır.",
            "Ailenin beklenen, istenen, sevilen çocuğudur. Takdir edilmekten, şımartılmaktan hoşlanır ve tabiatı itibarı ile eğlenceli tavırları, neşeli mizacı ile beklediği ilgiyi de görür. Sanatsal yönleri güçlüdür, yaratıcıdır. Kendine güzel oyunlar yaratabilir, resim ve müziğe ilgi duyabilir, sanatın her dalına meraklıdır."),
    BASAK("Başak", "24.8", "22.9", "Toprak", "Değişken", "Merkür", "Sarı", "Akik", "Çarşamba",
            "Titiz, çalışkan, mükemmeliyetçi, eleştirel, detaycı, emektar, hizmet odaklı",
            "Akılcı ve pratik bir zekaya sahiptir. Dakiktir, çalışkandır, detaylara önem verir. Eleştirel ve titiz yönleri zaman zaman onu zorlayıcı kılabilir. Ancak hizmet odaklı yapısıyla yaşamınızda siz farkında olmadan hayatınızı kolaylaştıran kişidir.",
            "Başak burcu kadınına bir şey beğendirmek oldukça zordur. En küçük kusur ve detayları görebilecek göze sahiptir. Bazen bu detaylar içinde çok fazla kaybolabilir. Seçim yapmakta oldukça zorlanır, kuruntu ve evhamlar geliştirebilir.",
            "Temiz, net, hatasız kesimleri tercih eder, süsten, aksesuardan, frapanlıktan hoşlanmaz. Tarzı konusunda da mükemmeliyetçidir, kendi düşüncesi kadar başkalarınınki de önemlidir.",
            "Bağırsaklar", "Boğa, Balık, İkizler", "Akrep, Aslan, Kova",
            "Titiz, becerikli, zeki, dakik, kendini işine, evine, çocuklarına adayabilen, hizmet ruhu yüksek, çalışkan",
            "Huzursuz, evhamlı, mükemmeliyetçi, eleştirel, seçici, takıntılı",
            "Başak akılcı bir burçtur, fazla duygusallığı gereksiz bulabilir, mantığı, pratik zekası hep öndedir. Mükemmeliyetçi ve eleştirel yönleri ile son derece seçicidir. Doğru eşi bulmak için çaba sarfeder, Başak’ların evlenmesi kolay değildir. Sorumluluk duygusu oldukça yüksektir, üzerine düşen görevleri yerine getirir ancak karşısındakinden sürekli memnuniyetsiz tavrı, eleştirel bakışı eşini veya sevgilisini bıktırabilir. Çoğu zaman bunu elinde olmadan, dürtüsel şekilde yapar ancak yanlış anlaşılabilir. Zekası, kıvraklığı, becerikliliği ile Başak eşiniz hayatınızı kolaylaştırır. Ancak büyük bir aşk, tutku ve romantizm beklemek zordur.",
            "Çocuklarının emrine amadedir, çalışkandır, onlar için en mükemmelini ister, arar, yoktan var eder. Ancak beklentileri de oldukça fazla olabilir. Çocuğunu fazla eleştirebilir, zekasıyla baskı kurabilir, kontrolcü olabilir. Fazla evhamlı olması zaman zaman çileden çıkarabilir.",
            "Çalışkandır ve sorumluluklarına bağlıdır. Maceradan hoşlanmaz, ev iş arasında mekik dokur. Çocuklarının hayatını kolaylaştıracak pratik dokunuşlar yapar. Duygusal olmaktan ziyade doğruları yapan, titiz, mükemmel baba olmak önemlidir.",
            "Güzel, narin ve hassastır, hassasiyeti onu hastalıklara da meyilli yapabilir, beslenme sorunları olabilir. Anne babayı uğraştırabilir. Ancak son derece pratik zekalı, temiz, titiz bir çocuktur. Mantıklı yaklaştığınız takdirde kuralları ve düzeni severler."),
    TERAZI("Terazi", "23.9", "23.10", "Hava", "Öncü", "Venüs", "Mavi, Pembe", "Safir", "Cuma",
            "Adil, eşitlikçi, dengeli, uyumlu, sakin, sabırlı, akıllı, kibar",
            "Sakin, uyumlu görüntüsünün ardında ne istediğini iyi bilen ve dominant bir yapısı vardır. Huzur onun için önemlidir. Sanata düşkündür. Keyif aldığı konularda para harcamayı sever. İlişkisinde denge ve eşitlik bekler. ",
            "Zarafeti ve güzelliğiyle dikkat çekicidir. Akıllı ve sabırlıdır, çatışmadan hoşlanmaz, dengeli, uyumlu bir birliktelik arar. Gizli mükemmeliyetçi bir yönü vardır. Politik ve kibar tutumu ve davranışlarıyla takdir toplar.",
            "Zarif, kibar, rafine zevkleri yansıtan hoş giysiler, pastel renkler, hafiflik, uçuşan etek veya elbiseler, nadide kumaşlar, marka ve tasarım giysiler, aksesuarlar",
            "Böbrekler", "İkizler, Kova, Koç", "Oğlak, Balık",
            "Akılcı, mantıklı, dengeli, uyumlu, adil, zarif, kibar, nazik, sanatçı ruhlu, hoş, efendi",
            "Zevklerine, keyfine düşkün, üşengeç, uykucu, kararsız, manipülatif",
            "Terazi için uyum ve dengeler her şeyden önemlidir. Kendini ve karşısındaki sürekli tartar, en doğru ve en uygun adımı atmaya çalışır. Yalnız olmayı asla istemez. Bir Terazi’nin hayatında her daim birisi vardır. Aşk ve sevgi ön plandadır ancak akılcı ve mantıklı davranır. Stratejik, planlı hareket edebilir. İşbirliğine her zaman açıktır, orta yolu her zaman arar. Sanatçı ruhunu tatmin eden kişilerden hoşlanır. En tahammül edemediği şey haksızlık, eşitsizlikdir. Karşınızda haklı gördüğü herkesi savunabilir. Terazi sevgiliniz veya eşiniz varsa kimsenin hakkını yemeyin zira sevgili veya eş demez kim haklıysa onu tutar. Özgürlüğüne düşkündür, zarafetine aldanıp zayıf olduğunu asla düşünmeyin, akılcı, yönlendirici, baskın bir karakterdir.",
            "Çocuklarına karşı son derece adildir, birden fazla çocuğu varsa hepsine aynı oranda sevgi ve şefkat göstermek için çırpınır, eşitlikçi ve adil bir yaklaşım sergiler. Çocuğunu sanatsal aktivitelere yönlendirebilir. Çocuğuyla dengeli ve uyumlu bir ilişki kurmak onun için önemlidir, bağırıp çağıran, cezalandıran bir anne değildir, sorunlara akılcı ve barışçıl çözümler getirmeye çalışır.",
            " Herkesin gözdesidir. İlişkileri yönetmede usta olan baba Terazi çocuğuyla ilişkilerini de yönetmekte zorlanmayacaktır. Duygusal olmak yerine mantıklı yaklaşacak, açıklamalar getirerek ikna gücünü sonuna dek kullanacaktır.",
            "Sosyal bir çocuktur. Daha çok küçük yaşta karşı cins ilişkileri ilgisini çeker, dolayısıyla nasıl göründüğü, nasıl giyindiği, saçları vb önemlidir. Her daim bakımlı ve güzel görünmek ister. Estetik yönleri güçlüdür, sanata meraklıdır."),
    AKREP("Akrep", "24.10", "22.11", "Su", "Sabit", "Mars", "Bordo", "Opal", "Salı",
            "Mücadeleci, güçlü, yılmaz, hırslı kişilerdir. Pes ettiğini düşündüğünüz anda küllerinden yeniden doğabilir. Güvenilir, kaliteli insanlardır.",
            "Şeytan tüyü de denilebilecek farklı bir gizem, manyetizma ve çekiciliğe sahiptirler. Pek çok şeyin farkında değilmiş gibi dursalar da sezgileri sayesinde anlayışları, kavrayışları son derece güçlü erkeklerdir. Yalan ve riyaya tahammülleri yoktur. ",
            "Gizemli, sezgileri güçlü, zorlayıcı Akrep burcu kadınına asla yalan söylememenizi, onu aldatmamanızı tavsiye edebiliriz. Kapalı sırların üzerine gitmekten, sorgulamaktan asla vazgeçmez. Zor beğenir, zor bırakır.",
            "Koyu renk giysiler, gizemli görünüm, kapatan aksesuarlar ve makyaj, siyah ojeler, dudaklar, dekolte, seksi giysiler",
            "Cinsel bölgeler", "Yengeç, Balık, Boğa", "Kova, Aslan, Başak",
            "Mücadeleci, yılmaz, kararlı, gözükara, derin, sezgisel, farkındalığı ve algısı yüksek",
            "Şüpheci, kıskanç, biriktirip sonra patlayan, sessiz, derinden ilerleyen",
            "Bir Akrep burcuyla birlikteyseniz her şeyden önce ondan hiçbirşey saklayamayacağınızı bilmeniz gerekir. Zira sizi bilinçaltınızın en derinlerinde kalan şeylere varana dek okuyabilir, çoğu zaman bunların siz bile farkında değilsinizdir ancak o farkındadır. Dolayısıyla Akrep burcuyla ilişki pek de kolay değildir. Sizi sürekli bir dönüşüme ve değişime zorlar. Akrep sevgiliye yanlış yapmayın. Süregelen bir ilişkiniz varsa zaten size yapmamanız gerektiği hissini çoktan vermiştir. Oldukça kararlı ve tutkuludur. Bıkması ve bırakması zordur. Karşısındaki artık değiştirip dönüştüremeyeceğini anladığında kendi bırakır. Aksi takdirde onun kıskaçlarından kurtulmanız pek de kolay değildir.",
            " Çocukların psikolojisinden son derece iyi anlar. Onları nasıl yönetip yönlendirebileceği çarçabuk bilir ve uygular. Ancak mücadeleci yönü, hayata karşı hırsı, iddiası ve rekabeti onu zaman zaman baskıcı, uğraşması zor ve meşakkatli kılabilir.",
            "Her şeyi bilir, görür ve anlar. Ondan birşey saklayamaz, yalan söyleyemezsiniz. Size söylemese, dışa vurmasa bile olan bitenin farkındadır. Herhangi bir açığınızı eğer yüzünüze vurmuyorsa, bilmediğini ya da farkında olmadığını asla düşünmeyin. Tehlikeli bir durum yoksa yalnızca psikolojik olarak sizi yıpratmak istemediğinden söylemiyordur.",
            "Gizemlidir, sevimlidir, şeytan tüylüdür, algıları ve zekası düşündüğünüzün kat kat üzerinde olabilir. Her şeye karşı derin bir ilgisi ve merakı vardır. Her türlü gizemi çözmeye çalışan bir detektif gibidir. Zor oyunlardan, mücadele ve rekabetten hoşlanır. Yaşadıklarını ve kendisine yapılanları ömrü boyunca unutmaz."),
    YAY("Yay", "23.11", "21.12", "Ateş", "Değişken", "Jüpiter", "Eflâtun", "Topaz", "Perşembe",
            "Bağımsız, özgür, hareketli, dinamik, sportif, keşif ve macera ruhuna sahip",
            "Yay burcu erkeği özgürlüğü sever, ciddi bir birlikteliğiniz olabilir, evlenebilirsiniz ancak onu asla kısıtlamamalısınız. Bağlanmakta, ev erkeği olmakta zorlanır. Harika bir seyahat ortağı olur, eğlenceli zaman geçirebilirsiniz.  ",
            " Bağımsız bir ruha sahiptir. Gezmeyi, tozmayı, eğlenmeyi sever. Yeni yerler görmekten, yeni dost ve arkadaşlar tanımaktan, ufkunu ve sınırlarını zorlamaktan zevk alır. Bir Yay kadını ile asla sıkılmazsınız. Zor olan tek şey onun hızına ayak uydurabilmektir.",
            "Salaş ve bohem giysiler, çiçekten taçlar, dağınık ve uçuşan saçlar, çiçekli basma kıyafetler, bol ve rahat giysiler",
            "Kalça, baldır, sinirler", "Aslan, Koç, İkizler", "Oğlak, Yengeç",
            "Neşeli, canlı, hareketli, iyimser, iyiliksever, inançlı, bilge",
            "Patavatsız, sınır tanımayan, özgürlüğüne düşkün, aşırı para harcamaya, yemeye, içmeye düşkün",
            "Maceradan, seyahatlerden hoşlanıyorsanız, Yay burcu tam size göre olabilir. Sınır tanımayan özgürlüğü, iyilikseverliği, insanlara karşı cömert ve paylaşımcı yaklaşımı onu son derece cazip kılar. Hayatınızda yepyeni pencereler, bakış açıları katabilir, bir Yay burcuyla asla sıkılmazsınız. Ancak Yay burcun sevgiliniz asla size özel kalmaz. Çevresinde her daim bir dolu arkadaşı, kendi düşünce ve felsefeleri vardır. Bağımsız ruhludur ve onu rahat bırakmalı, işine gücüne ve yaptıklarına karışmamalısınız. Ona her zaman ilgi çekici fikirlerle, görüşlerle ve eylemle gelmelisiniz, yeni olan her şeyi deneyimlemekten hoşlandığından ve değişime tutkun olduğundan, aşırı duygusallıktan, derinlikten, dipdipe soluk almayan ilişkilerden, sınırlı, sorumlu, şekilli birlikteliklerden asla hoşlanmaz.",
            "Yay burcu bir anneyle hayat her şeyden önce eğlencelidir. Bağımsız ve özgürlükçü ruhuyla çocuğunu da bir kelebek gibi havalandırır, geniş görüş ve fikirleriyle zekasını ve ufkunu açar. Çocuğunu seyahatlere götürür, yeni kültürlerle, yeni dillerle tanışmasını sağlar. Bağımsız ve özgür yanlarıyla mesafeli, uzak bir anne olabilir, zira her daim kendine özgü bir kişisel ajandası ve planları vardır.",
            "Yay burcu bir babanız varsa ele avuca gelmeyen, her zaman bir yerlerde işi, seyahati, uğraşı olan bu adamı yakalamanız zordur. Sosyal çevresi son derece geniştir, fikirleri ve görüşlerini paylaşmakta sınır tanımaz. İçinde ve ruhunda tek ve biricik olabilirsiniz ama dünyevi anlamda onun her zaman bir meşgalesi, kendini adadığı bir inancı, felsefesi, mesleği olacaktır.",
            "Hayatınıza neşe, canlılık ve hareket katar. İyimser ve pozitif yanları hayatınızı kolaylaştırırken aşırı sosyal olma isteği, yeni şeyler ve kişiler tanıma ve paylaşma arzusu ile onunla çok da başbaşa kalamazsınız. Arkadaş partilerinin birinden diğerine, insan ve paylaşım olan her yere koşturabilirsiniz."),
    OGLAK("Oğlak", "22.12", "20.1", "Toprak", "Öncü", "Satürn", "Kahverengi, siyah", "Ametist", "Cumartesi",
            "Ciddi, soğukkanlı, gereğinde mesafeli, planlı, organize, disiplinli, iş ve kariyer odaklı",
            "Güvenilirdir. Hiçbir şeyş kolay kolay kabul etmez, çok az şeyi kabul eder, ancak tamam dediğinde sonuna kadar güvenebilirsiniz. Zamanlaması çok iyidir, dakiktir. Disiplin, düzen, kural anlayışıyla zaman zaman sıkıcı olabilir ama sizi asla yarı yolda bırakmayacağından emin olabilirsiniz.",
            "Evine ve ailesine düşkündür. Yalnız kalmayı, tek başına hareket etmeyi sever. Kendi kural ve prensipleri vardır. Zaman zaman fazlasıyla disiplinli ve soğuk olabilir. İyi bir iş kadınıdır. Çalışmıyorsa bile evinde, ailesine karşı sorumluluklarının son derece bilincinde, tam bir görev insanıdır.",
            "Koyu ve resmi giysiler, şekilli kesimler, iş ve proje sahibi görüntüsü, koyu toprak renkler, sıkı ve vücuda oturan kıyafetler, smokin, frak, fötr şapka",
            "Kemikler, dişler, cilt", "Yengeç, Boğa, Başak", "İkizler, Yay, Koç",
            "Stratejik, planlı, düzenli, tertipli, ciddi, tutumlu, hesaplı, dayanıklı, güçlü, güvenilir",
            "Katı, soğuk, mesafeli, cimri, yalnızlığı ve izole yaşamı seven, antisosyal, itibar düşkünü, buyurgan",
            "Herşeyi olduğu gibi birlikteliklerini de son derece ciddiye alırlar. Soğukkanlı, mesafeli ve katı görünümleri güveni ve istikrarı onda bulabileceğinizi size inandırır. Ancak bir Oğlak burcuyla ilişki sabır gerektirir zira zaman içinde anlaşılır ve olgunlaşır. Oğlak burcu sevgiliniz ve eşiniz plandan, düzenden hoşlanır. Olmadık sürprizlerle karşınıza çıktığınızda çok şey beklemeyin, sizi fazla hayal kırıklığına uğratmazsa iyidir. Yüzeysellikten, laubalilikten, boş konuşmalardan asla hoşlanmazlar. Ona karşı kullanacağınız kelimeleri, sözleri dikkatli ve özenle seçmelisiniz. Aksi karşınıza gerçek bir sınav duvarı şeklinde çıkabilirler. Sosyal konum ve statü onlar için önemlidir. Eşlerinin ve sevgililerinin toplumda saygın bir yeri olmasını, toplumca kabul gören davranışlar sergilemelerini beklerler ve itibarlarının zarar görmesine asla tahammül etmezler.",
            "Şefkatini, merhametini, sıcaklığını, duygularını göstermekten hoşlanmaz. Mesafeli ve ciddi bir annedir. Çocukların sorunlarına yapıcı, mantıklı, zorlayıcı ve sert olabilen çözümlerle gelebilir. Konuşmayı çok sevmez, konuştuğunda fazla ağır olabilecek sözler söyleyebilir. Çocuğundan küçük de olsa olgunluk, itaat ve ağırbaşlılık bekler.",
            "İşi ve itibarı ön plandadır. Çoluk çocukla işler pek de ona göre değildir. Oyunlardan, şakalardan pek haz etmez. Canlı, neşeli, iyimser bir baba pek değildir. Ancak bir şeyi yaparım, alırım dediğinde mutlaka yapar, alır, sizi yarı yolda bırakmaz. Ciddiyeti ile sıkıcı olabilir.",
            "Daha küçük yaşta olgun ve büyük insan gibidir. Oyunlarını bile plan yaparak oynar, arkadaşlarını yönetir, dizer, sıraya sokar. Planlı ve düzenli bir hayattan hoşlanır. Duygularını paylaşabilen bir çocuk değildir. Onu anlamanız zaman ve sabır isteyebilir.");

    private final String generalNote = "Dictionary";

    private String burcAdi;
    private String baslangicTarihi;
    private String bitisTarihi;
    private String element;
    private String nitelik;
    private String gezegen;
    private String renk;
    private String tas;
    private String gun;
    private String ozellikleri;
    private String erkegi;
    private String kadini;
    private String tarzi;
    private String bedendeTemsilEttigiBolgeler;
    private String anlastigiBurclar;
    private String anlasamadigiBurclar;
    private String olumluYonleri;
    private String olumsuzYonleri;
    private String ask;
    private String anne;
    private String baba;
    private String cocuk;

    /* Constructor */
    private Dictionary(String burcAdi, String baslangicTarihi, String bitisTarihi, String element, String nitelik,
                       String gezegen, String renk, String tas, String gun, String ozellikleri, String erkegi,
                       String kadini, String tarzi, String bedendeTemsilEttigiBolgeler, String anlastigiBurclar,
                       String anlasamadigiBurclar, String olumluYonleri, String olumsuzYonleri, String ask,
                       String anne, String baba, String cocuk) {
        this.burcAdi = burcAdi;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.nitelik = nitelik;
        this.element = element;
        this.gezegen = gezegen;
        this.renk = renk;
        this.tas = tas;
        this.gun = gun;
        this.ozellikleri = ozellikleri;
        this.erkegi = erkegi;
        this.kadini = kadini;
        this.tarzi = tarzi;
        this.bedendeTemsilEttigiBolgeler = bedendeTemsilEttigiBolgeler;
        this.anlastigiBurclar = anlastigiBurclar;
        this.anlasamadigiBurclar = anlasamadigiBurclar;
        this.olumluYonleri = olumluYonleri;
        this.olumsuzYonleri = olumsuzYonleri;
        this.ask = ask;
        this.anne = anne;
        this.baba = baba;
        this.cocuk = cocuk;
    }

    public String getBurcAdi() {
        return this.burcAdi.toUpperCase();
    }

    public String getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public String getBitisTarihi() {
        return bitisTarihi;
    }
    public String getOzellikleri() {
        return ozellikleri;
    }


    public String getElement() {
        return element;
    }

    public String getNitelik() {
        return nitelik;
    }

    public String getGezegen() {
        return gezegen;
    }

    public String getRenk() {
        return renk;
    }

    public String getTas() {
        return tas;
    }

    public String getGun() {
        return gun;
    }

    public String getErkegi() {
        return erkegi;
    }

    public String getKadini() {
        return kadini;
    }

    public String getTarzi() {
        return tarzi;
    }

    public String getBedendeTemsilEttigiBolgeler() {
        return bedendeTemsilEttigiBolgeler;
    }

    public String getAnlastigiBurclar() {
        return anlastigiBurclar;
    }

    public String getAnlasamadigiBurclar() {
        return anlasamadigiBurclar;
    }

    public String getOlumluYonleri() {
        return olumluYonleri;
    }

    public String getOlumsuzYonleri() {
        return olumsuzYonleri;
    }

    public String getAsk() {
        return ask;
    }

    public String getAnne() {
        return anne;
    }

    public String getBaba() {
        return baba;
    }

    public String getCocuk() {
        return cocuk;
    }

    @Override
    public String toString() {
        return this.burcAdi + "\n";
    }


    public static void kilavuz() {
        System.out.println("Burcu Tarihinden veya Burç İsminden Bulabilirsiniz. " +
                "\n Kullanım Örneği:       01.01.2020 !all" +
                "\n                        kova !all" +
                "\n                        kova !kadini !erkegi !tarzi" +
                "\n                        01.01.2020 !ozellikler !gezegen !renk" +
                "\nTüm Komutlar İçin: cmd" +
                "\nBu Ekranı Tekrar Görmek İçin k yazabilirsiniz." +
                "\nÇıkış: !q\n");
    }

//main fnc
    public static void main(String[] args) {

        HashMap<String, ArrayList<Dictionary>> hmap = new HashMap<String, ArrayList<Dictionary>>();

        for (Dictionary burcSelector : Dictionary.values()) {

            String burcAdi = burcSelector.getBurcAdi();

            ArrayList<Dictionary> listKeyBurcAdi = (hmap.containsKey(burcAdi)) ? hmap.get(burcAdi)
                    : new ArrayList<Dictionary>();

            listKeyBurcAdi.add(burcSelector);
            hmap.put(burcAdi, listKeyBurcAdi);
//Gorsel
            System.out.println(Strings.repeat("-", hmap.size()));
        }


        System.out.println("! Loading Complete...");
        System.out.println("\n-----DICTIONARY SIZE: " + hmap.size() + "-----\n");

//EOG

//Kılavuz
        kilavuz();
//EOK


//GetObjList
        Dictionary[] islenecekObjeler = {KOVA, BALIK, KOC, BOGA, IKIZLER, YENGEC, ASLAN, BASAK, TERAZI, AKREP, YAY, OGLAK};

//input kw process
        Scanner kullaniciGirdisi = new Scanner(System.in);
        Boolean quit = true;
        String ilkKelime = null;
        String alinanTarihGun = null;
        String alinanTarihAy = null;

        do {
            System.out.println("Search: ");
            String kullanicidanAlinanVeri = kullaniciGirdisi.nextLine();
            String[] parcalanmisKullaniciBurcIsmiGirdisi = kullanicidanAlinanVeri.split(" ");
            String[] parcalanmisKullaniciTarihGirdisi = kullanicidanAlinanVeri.split("\\.");
            String[] parcalanmisKullaniciOpt = kullanicidanAlinanVeri.split("!");
//Kılavuz
            if(kullanicidanAlinanVeri.equals("cmd")){
                            System.out.println("    Komutlar: " +
                            "!all !ozellikler !element !nitelik !renk !tas !gun !gezegen !erkegi !kadini !tarzi !ask"+
                            "\n       !beden !anlastiklari !anlasamadiklari !olumlu !olumsuz !anne !baba !cocuk");
                }


            if(kullanicidanAlinanVeri.equals("k")){
                kilavuz();}
//EOK



            for(int i=0;i<parcalanmisKullaniciOpt.length;i++){
                System.out.println(parcalanmisKullaniciOpt[i]);
            }

            if (parcalanmisKullaniciBurcIsmiGirdisi.length > 0) {
                ilkKelime = parcalanmisKullaniciBurcIsmiGirdisi[0];
            }


            if (parcalanmisKullaniciTarihGirdisi.length > 1) {
                alinanTarihGun = parcalanmisKullaniciTarihGirdisi[0];
                alinanTarihAy = parcalanmisKullaniciTarihGirdisi[1];


                char controlZeroAy = parcalanmisKullaniciTarihGirdisi[1].charAt(0);


                if (controlZeroAy == '0') {
                    char controlZeroAyProcess = parcalanmisKullaniciTarihGirdisi[1].charAt(1);
                    String controZeroAyResult = String.valueOf(controlZeroAyProcess);
                    alinanTarihAy = controZeroAyResult;
                    //System.out.println("Ay formatlandı.");
                }

                char controlZeroGun = parcalanmisKullaniciTarihGirdisi[0].charAt(0);


                if (controlZeroGun == '0') {
                    char controlZeroGunProcess = parcalanmisKullaniciTarihGirdisi[0].charAt(1);
                    String controZeroGunResult = String.valueOf(controlZeroGunProcess);
                    alinanTarihGun = controZeroGunResult;
                    //System.out.println("Gün formatlandı.");
                }


            }

            String tarihAra = alinanTarihGun + "." + alinanTarihAy;


//TarihEngine
            final String[] getirilecekObje = {null};
            final Integer[] bulundu = {0};


            for (int i = 0; i < islenecekObjeler.length; i++) {
                HashMap<String, String> tarihBurcKeyHmap = extendsDateAndMatch(islenecekObjeler[i]);


                if (parcalanmisKullaniciTarihGirdisi.length > 1) {
                    tarihBurcKeyHmap.forEach((k, v) -> {

                        if (k.equals(tarihAra)) {
                            getirilecekObje[0] = v;
                            bulundu[0] = 1;


                        }

                    });

                }
            }

//Main Engine
            if (!kullanicidanAlinanVeri.equalsIgnoreCase("!q")) {
                System.out.println("    |");

                ArrayList<Dictionary> matchedObject = new ArrayList<Dictionary>();

                if (bulundu[0] == 1) {
                    matchedObject = hmap.get(getirilecekObje[0].toUpperCase());

                } else if (bulundu[0] == 0) {
                    matchedObject = hmap.get(ilkKelime.toUpperCase());
                }
                bulundu[0] = 0;

//Wr+Result2Console
                if (matchedObject != null && matchedObject.size() > 0) {
                    for (Dictionary key : matchedObject) {
                        System.out.print("    Burç: " + key + "\n");
                        for(String str: parcalanmisKullaniciOpt) {
                            if(str.trim().contains("all")){
                                System.out.println("    Özellikler: " + key.getOzellikleri() + "\n");
                                System.out.println("    Nitelikleri: " + key.getNitelik() + "\n");
                                System.out.println("    Element: " + key.getElement() + "\n");
                                System.out.println("    Rengi: " + key.getRenk() + "\n");
                                System.out.println("    Taşı: " + key.getTas() + "\n");
                                System.out.println("    Günü: " + key.getGun() + "\n");
                                System.out.println("    Gezegeni: " + key.getGezegen() + "\n");
                                System.out.println("    Erkeği: " + key.getErkegi() + "\n");
                                System.out.println("    Kadını: " + key.getKadini() + "\n");
                                System.out.println("    Tarzı: " + key.getTarzi() + "\n");
                                System.out.println("    Olumlu Yönleri: " + key.getOlumluYonleri() + "\n");
                                System.out.println("    Olumsuz Yönleri: " + key.getOlumsuzYonleri() + "\n");
                                System.out.println("    Ask: " + key.getAsk() + "\n");
                                System.out.println("    Bedende Temsil Ettiği Bölgeler: " + key.getBedendeTemsilEttigiBolgeler() + "\n");
                                System.out.println("    Anlaştığı Burçlar: " + key.getAnlastigiBurclar() + "\n");
                                System.out.println("    Anlaşamadığı Burçlar: " + key.getAnlasamadigiBurclar() + "\n");
                                System.out.println("    Anne: " + key.getAnne() + "\n");
                                System.out.println("    Baba: " + key.getBaba() + "\n");
                                System.out.println("    Çocuk: " + key.getCocuk() + "\n");
                            }
                            if(str.trim().contains("ozellikler")){
                                System.out.println("    Özellikler: " + key.getOzellikleri() + "\n");
                            }
                            if(str.trim().contains("element")){
                                System.out.println("    Element: " + key.getElement() + "\n");
                            }
                            if(str.trim().contains("nitelik")){
                                System.out.println("    Nitelikleri: " + key.getNitelik() + "\n");
                            }
                            if(str.trim().contains("renk")){
                                System.out.println("    Rengi: " + key.getRenk() + "\n");
                            }
                            if(str.trim().contains("tas")){
                                System.out.println("    Taşı: " + key.getTas() + "\n");
                            }
                            if(str.trim().contains("gun")){
                                System.out.println("    Günü: " + key.getGun() + "\n");
                            }
                            if(str.trim().contains("gezegen")){
                                System.out.println("    Gezegeni: " + key.getGezegen() + "\n");
                            }
                            if(str.trim().contains("erkegi")){
                                System.out.println("    Erkeği: " + key.getErkegi() + "\n");
                            }
                            if(str.trim().contains("kadini")){
                                System.out.println("    Kadını: " + key.getKadini() + "\n");
                            }
                            if(str.trim().contains("tarzi")){
                                System.out.println("    Tarzı: " + key.getTarzi() + "\n");
                            }
                            if(str.trim().contains("ask")){
                                System.out.println("    Aşk: " + key.getAsk() + "\n");
                            }
                            if(str.trim().contains("beden")){
                                System.out.println("    Bedende Temsil Ettiği Bölgeler: " + key.getBedendeTemsilEttigiBolgeler() + "\n");
                            }
                            if(str.trim().contains("anlastiklari")){
                                System.out.println("    Anlaştığı Burçlar: " + key.getAnlastigiBurclar() + "\n");
                            }
                            if(str.trim().contains("anlasamadiklari")){
                                System.out.println("    Anlaşamadığı Burçlar: " + key.getAnlasamadigiBurclar() + "\n");
                            }
                            if(str.trim().contains("olumlu")){
                                System.out.println("    Olumlu Yönleri: " + key.getOlumluYonleri() + "\n");
                            }
                            if(str.trim().contains("olumsuz")){
                                System.out.println("    Olumsuz Yönleri " + key.getOlumsuzYonleri() + "\n");
                            }
                            if(str.trim().contains("anne")){
                                System.out.println("    Anne: " + key.getAnne() + "\n");
                            }
                            if(str.trim().contains("baba")){
                                System.out.println("    Baba: " + key.getBaba() + "\n");
                            }
                            if(str.trim().contains("cocuk")){
                                System.out.println("    Çocuk: " + key.getCocuk() + "\n");
                            }



                        }
                    }
                } else {
                    System.out.println("    <Not Found>");
                }
                System.out.println("    |");
            } else {
                System.out.println("\n----Bye----");
                quit = false;
            }
        } while (quit);

    }

//Fnc
    public static HashMap<String, String> extendsDateAndMatch(Dictionary object) {
        HashMap<String, String> hmapFiltre = new HashMap<String, String>();


        if (object != null) {
            String baslangicTarihi = object.getBaslangicTarihi();
            String bitisTarihi = object.getBitisTarihi();

            String[] baslangicTarihiParcala = baslangicTarihi.split("\\.");
            ;
            String[] bitisTarihiParcala = bitisTarihi.split("\\.");

            String baslangicTarihiGun = baslangicTarihiParcala[0];
            String baslangicTarihiAy = baslangicTarihiParcala[1];

            String bitisTarihiGun = bitisTarihiParcala[0];
            String bitisTarihiAy = bitisTarihiParcala[1];

            int _baslangicTarihiGun = Integer.parseInt(baslangicTarihiGun);
            int _bitisTarihiGun = Integer.parseInt(bitisTarihiGun);


            int bsGun = _baslangicTarihiGun;
            int btGun = _bitisTarihiGun;
            int j = 1;


            for (int i = bsGun; j <= btGun; i++) {
                if (i <= 31) {
                    hmapFiltre.put((i + "." + baslangicTarihiAy), object.getBurcAdi());
                } else if (j <= btGun) {
                    hmapFiltre.put((j + "." + bitisTarihiAy), object.getBurcAdi());
                    j++;
                } else {
                    break;
                }
            }

        }
        return hmapFiltre;
    }


}







