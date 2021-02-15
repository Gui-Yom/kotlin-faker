@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package io.github.serpro69.kfaker

import io.github.serpro69.kfaker.provider.*
import io.github.serpro69.kfaker.provider.unique.GlobalUniqueDataDataProvider

/**
 * Object provides functionality to generate fake data.
 *
 * Each category from this [Faker] is represented by a property that has the same name as the `.yml` file.
 */
class Faker @JvmOverloads constructor(internal val fakerConfig: FakerConfig = FakerConfig.builder().create { }) {
    private val fakerService: FakerService = FakerService(this, fakerConfig.locale, fakerConfig.random)

    val unique = GlobalUniqueDataDataProvider()

    val randomProvider: RandomProvider = RandomProvider(fakerConfig.random)

    val separator: Separator
    val currencySymbol: CurrencySymbol

    val address: Address
    val ancient: Ancient
    val animal: Animal
    val app: App
    val appliance: Appliance
    val aquaTeenHungerForce: AquaTeenHungerForce
    val artist: Artist
    val backToTheFuture: BackToTheFuture
    val bank: Bank
    val barcode: Barcode
    val basketball: Basketball
    val beer: Beer
    val bigBangTheory: BigBangTheory
    val blood: Blood

    val bojackHorseman: BojackHorseman
    val book: Book
    val bossaNova: BossaNova
    val breakingBad: BreakingBad
    val buffy: Buffy
    val business: Business
    val cannabis: Cannabis
    val cat: Cat
    val chiquito: Chiquito
    val chuckNorris: ChuckNorris
    val code: Code
    val coffee: Coffee
    val coin: Coin
    val color: Color
    val commerce: Commerce
    val community: Community
    val company: Company

    //    val compass: Compass
    val computer: Computer
    val construction: Construction
    val control: Control
    val cosmere: Cosmere
    val cryptoCoin: CryptoCoin
    val cultureSeries: CultureSeries
    val currency: Currency
    val dcComics: DcComics
    val demographic: Demographic
    val departed: Departed
    val dessert: Dessert
    val device: Device
    val dnd: DnD
    val dog: Dog
    val dota: Dota
    val dragonBall: DragonBall
    val drivingLicense: DrivingLicense
    val drone: Drone
    val drWho: DrWho
    val dumbAndDumber: DumbAndDumber
    val dune: Dune
    val educator: Educator
    val elderScrolls: ElderScrolls
    val electricalComponents: ElectricalComponents
    val eSport: ESport
    val fallout: Fallout
    val familyGuy: FamilyGuy
    val file: File

    //    val finance: Finance
    val food: Food
    val football: Football
    val freshPriceOfBelAir: FreshPriceOfBelAir
    val friends: Friends
    val funnyName: FunnyName
    val futurama: Futurama
    val game: Game
    val gameOfThrones: GameOfThrones
    val gender: Gender
    val ghostBusters: GhostBusters
    val gratefulDead: GratefulDead
    val greekPhilosophers: GreekPhilosophers
    val hacker: Hacker
    val halfLife: HalfLife
    val harryPotter: HarryPotter
    val heroes: Heroes
    val heroesOfTheStorm: HeroesOfTheStorm
    val heyArnold: HeyArnold
    val hipster: Hipster
    val hitchhikersGuideToTheGalaxy: HitchhikersGuideToTheGalaxy
    val hobbit: Hobbit
    val horse: Horse
    val house: House
    val howIMetYourMother: HowIMetYourMother
    val idNumber: IdNumber
    val industrySegments: IndustrySegments
    val internet: Internet

    //    val invoice: Invoice
    val job: Job
    val kPop: KPop
    val leagueOfLegends: LeagueOfLegends
    val lebowski: Lebowski
    val lordOfTheRings: LordOfTheRings
    val lorem: Lorem
    val lovecraft: Lovecraft
    val markdown: Markdown
    val marketing: Marketing
    val measurement: Measurement
    val michaelScott: MichaelScott
    val military: Military
    val minecraft: Minecraft
    val money: Money
    val movie: Movie
    val music: Music
    val myst: Myst
    val name: Name
    val nation: Nation
    val natoPhoneticAlphabet: NatoPhoneticAlphabet
    val newGirl: NewGirl
    val onePiece: OnePiece
    val opera: Opera
    val overwatch: Overwatch
    val parksAndRec: ParksAndRec
    val pearlJam: PearlJam
    val phish: Phish
    val phoneNumber: PhoneNumber
    val pokemon: Pokemon
    val prince: Prince
    val princessBride: PrincessBride
    val programmingLanguage: ProgrammingLanguage
    val quote: Quote
    val rajnikanth: Rajnikanth
    val relationship: Relationship
    val restaurant: Restaurant
    val rickAndMorty: RickAndMorty
    val rockBand: RockBand
    val rupaul: Rupaul
    val rush: Rush
    val science: Science
    val seinfeld: Seinfeld
    val shakespeare: Shakespeare
    val show: Show
    val siliconValley: SiliconValley
    val simpsons: Simpsons
    val slackEmoji: SlackEmoji
    val sonicTheHedgehog: SonicTheHedgehog

    //    val source: Source
    val southPark: SouthPark
    val space: Space
    val stargate: Stargate
    val starTrek: StarTrek
    val starWars: StarWars
    val strangerThings: StrangerThings
    val streetFighter: StreetFighter
    val stripe: Stripe
    val subscription: Subscription
    val suits: Suits
    val superhero: Superhero
    val superSmashBros: SuperSmashBros
    val swordArtOnline: SwordArtOnline
    val team: Team
    val theExpanse: TheExpanse
    val theITCrowd: TheITCrowd
    val theThickOfIt: TheThickOfIt
    val twinPeaks: TwinPeaks
    val umphreysMcgee: UmphreysMcgee
    val university: University
    val vehicle: Vehicle
    val ventureBros: VentureBros
    val verbs: Verbs
    val warhammerFantasy: WarhammerFantasy
    val vForVendetta: VForVendetta
    val witcher: Witcher
    val worldCup: WorldCup
    val worldOfWarcraft: WorldOfWarcraft
    val yoda: Yoda
    val zelda: Zelda

    init {
        // Special symbols
        separator = Separator(fakerService)
        currencySymbol = CurrencySymbol(fakerService)

        address = Address(fakerService)
        ancient = Ancient(fakerService)
        animal = Animal(fakerService)
        app = App(fakerService)
        appliance = Appliance(fakerService)
        aquaTeenHungerForce = AquaTeenHungerForce(fakerService)
        artist = Artist(fakerService)
        backToTheFuture = BackToTheFuture(fakerService)
        bank = Bank(fakerService)
        barcode = Barcode(fakerService)
        basketball = Basketball(fakerService)
        beer = Beer(fakerService)
        bigBangTheory = BigBangTheory(fakerService)
        blood = Blood(fakerService)
        bojackHorseman = BojackHorseman(fakerService)
        book = Book(fakerService)
        bossaNova = BossaNova(fakerService)
        breakingBad = BreakingBad(fakerService)
        buffy = Buffy(fakerService)
        business = Business(fakerService)
        cannabis = Cannabis(fakerService)
        cat = Cat(fakerService)
        chiquito = Chiquito(fakerService)
        chuckNorris = ChuckNorris(fakerService)
        code = Code(fakerService)
        coffee = Coffee(fakerService)
        coin = Coin(fakerService)
        color = Color(fakerService)
        commerce = Commerce(fakerService)
        community = Community(fakerService)
        company = Company(fakerService)
//        compass = Compass(fakerService)
        computer = Computer(fakerService)
        construction = Construction(fakerService)
        control = Control(fakerService)
        cosmere = Cosmere(fakerService)
        cryptoCoin = CryptoCoin(fakerService)
        cultureSeries = CultureSeries(fakerService)
        currency = Currency(fakerService)
        dcComics = DcComics(fakerService)
        demographic = Demographic(fakerService)
        departed = Departed(fakerService)
        dessert = Dessert(fakerService)
        device = Device(fakerService)
        dnd = DnD(fakerService)
        dog = Dog(fakerService)
        dota = Dota(fakerService)
        dragonBall = DragonBall(fakerService)
        drivingLicense = DrivingLicense(fakerService)
        drone = Drone(fakerService)
        drWho = DrWho(fakerService)
        dumbAndDumber = DumbAndDumber(fakerService)
        dune = Dune(fakerService)
        educator = Educator(fakerService)
        elderScrolls = ElderScrolls(fakerService)
        electricalComponents = ElectricalComponents(fakerService)
        eSport = ESport(fakerService)
//        fakeDataProvider = FakeDataProvider(fakerService)
        fallout = Fallout(fakerService)
        familyGuy = FamilyGuy(fakerService)
        file = File(fakerService)
//        finance = Finance(fakerService)
        food = Food(fakerService)
        football = Football(fakerService)
        freshPriceOfBelAir = FreshPriceOfBelAir(fakerService)
        friends = Friends(fakerService)
        funnyName = FunnyName(fakerService)
        futurama = Futurama(fakerService)
        game = Game(fakerService)
        gameOfThrones = GameOfThrones(fakerService)
        gender = Gender(fakerService)
        ghostBusters = GhostBusters(fakerService)
        gratefulDead = GratefulDead(fakerService)
        greekPhilosophers = GreekPhilosophers(fakerService)
        hacker = Hacker(fakerService)
        halfLife = HalfLife(fakerService)
        harryPotter = HarryPotter(fakerService)
        heroes = Heroes(fakerService)
        heroesOfTheStorm = HeroesOfTheStorm(fakerService)
        heyArnold = HeyArnold(fakerService)
        hipster = Hipster(fakerService)
        hitchhikersGuideToTheGalaxy = HitchhikersGuideToTheGalaxy(fakerService)
        hobbit = Hobbit(fakerService)
        horse = Horse(fakerService)
        house = House(fakerService)
        howIMetYourMother = HowIMetYourMother(fakerService)
        idNumber = IdNumber(fakerService)
        industrySegments = IndustrySegments(fakerService)
        internet = Internet(fakerService)
//        invoice = Invoice(fakerService)
        job = Job(fakerService)
        kPop = KPop(fakerService)
        leagueOfLegends = LeagueOfLegends(fakerService)
        lebowski = Lebowski(fakerService)
        lordOfTheRings = LordOfTheRings(fakerService)
        lorem = Lorem(fakerService)
        lovecraft = Lovecraft(fakerService)
        markdown = Markdown(fakerService)
        marketing = Marketing(fakerService)
        measurement = Measurement(fakerService)
        michaelScott = MichaelScott(fakerService)
        military = Military(fakerService)
        minecraft = Minecraft(fakerService)
        money = Money(fakerService)
        movie = Movie(fakerService)
        music = Music(fakerService)
        myst = Myst(fakerService)
        name = Name(fakerService)
        nation = Nation(fakerService)
        natoPhoneticAlphabet = NatoPhoneticAlphabet(fakerService)
        newGirl = NewGirl(fakerService)
        onePiece = OnePiece(fakerService)
        opera = Opera(fakerService)
        overwatch = Overwatch(fakerService)
        parksAndRec = ParksAndRec(fakerService)
        pearlJam = PearlJam(fakerService)
        phish = Phish(fakerService)
        phoneNumber = PhoneNumber(fakerService)
        pokemon = Pokemon(fakerService)
        prince = Prince(fakerService)
        princessBride = PrincessBride(fakerService)
        programmingLanguage = ProgrammingLanguage(fakerService)
        quote = Quote(fakerService)
        rajnikanth = Rajnikanth(fakerService)
        relationship = Relationship(fakerService)
        restaurant = Restaurant(fakerService)
        rickAndMorty = RickAndMorty(fakerService)
        rockBand = RockBand(fakerService)
        rupaul = Rupaul(fakerService)
        rush = Rush(fakerService)
        science = Science(fakerService)
        seinfeld = Seinfeld(fakerService)
        shakespeare = Shakespeare(fakerService)
        show = Show(fakerService)
        siliconValley = SiliconValley(fakerService)
        simpsons = Simpsons(fakerService)
        slackEmoji = SlackEmoji(fakerService)
        sonicTheHedgehog = SonicTheHedgehog(fakerService)
//        source = Source(fakerService)
        southPark = SouthPark(fakerService)
        space = Space(fakerService)
        stargate = Stargate(fakerService)
        starTrek = StarTrek(fakerService)
        starWars = StarWars(fakerService)
        strangerThings = StrangerThings(fakerService)
        streetFighter = StreetFighter(fakerService)
        stripe = Stripe(fakerService)
        subscription = Subscription(fakerService)
        suits = Suits(fakerService)
        superhero = Superhero(fakerService)
        superSmashBros = SuperSmashBros(fakerService)
        swordArtOnline = SwordArtOnline(fakerService)
        team = Team(fakerService)
        theExpanse = TheExpanse(fakerService)
        theITCrowd = TheITCrowd(fakerService)
        theThickOfIt = TheThickOfIt(fakerService)
        twinPeaks = TwinPeaks(fakerService)
        umphreysMcgee = UmphreysMcgee(fakerService)
        university = University(fakerService)
        vehicle = Vehicle(fakerService)
        ventureBros = VentureBros(fakerService)
        verbs = Verbs(fakerService)
        warhammerFantasy = WarhammerFantasy(fakerService)
        vForVendetta = VForVendetta(fakerService)
        witcher = Witcher(fakerService)
        worldCup = WorldCup(fakerService)
        worldOfWarcraft = WorldOfWarcraft(fakerService)
        yoda = Yoda(fakerService)
        zelda = Zelda(fakerService)
    }
}