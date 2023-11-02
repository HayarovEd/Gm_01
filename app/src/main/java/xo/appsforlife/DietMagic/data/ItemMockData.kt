package xo.appsforlife.DietMagic.data

import xo.appsforlife.DietMagic.R

data class ItemMockData(
    val name: String,
    val content: String,
    val imageInt: Int
)

val mockData = listOf(
    ItemMockData(
        name = "1. Why am I overweight?",
        content = "Despite what you might read, the problem of obesity isn’t caused by any single food and it’s not just a question of ‘a lack of willpower’. In fact, many factors influence what we eat. Our environment and lifestyles have changed in recent decades which means healthy choices are not always the easiest to make, and we tend to have more ready-made or take-away meals. This usually means more fat, sugar and salt compared with home-cooked meals, and often larger portion sizes too.\nAt the same time, we’re doing less physical activity than previous generations. Our jobs and leisure activities are more likely to involve sitting down, and we’re less likely to travel on foot or by bicycle. Many of us are also working from home more now, meaning we've lost the opportunity for exercise on the way to work.\nThis means we need to make conscious choices about what we eat and how we stay active. Often that means making an effort to eat healthily even when we’re busy, and finding ways to fit exercise into our busy lives.\nA good first step is to think about why you might have put on weight. Is this a recent change or a longer-term pattern? Did you start doing something differently – eating out more, being less active, or eating different foods – around the time you began putting on weight?\nIf you’re not sure where you’re going wrong, try keeping a food and drink diary for a week in a notebook, or record what you eat using a diet tracker app on your smartphone.",
        imageInt = R.drawable.image1
    ),
    ItemMockData(
        name = "2. Set yourself a weight loss target",
        content = "Losing weight can feel really difficult. To start with, work out how much weight you want to lose. With more people becoming overweight, how we view a ‘healthy weight’ can become skewed.\nYour body mass index (BMI) is a measurement of your weight in relation to your height. If you know these measurements, you can use a free online tool to find out your BMI and the weight you should be aiming for. You can use our BMI calculator.\nIf you weigh more than you think, don’t be disappointed or feel you have to take extreme measures. Break it down into small goals and focus on one step at a time.\nIf you have a lot of weight to lose, aim to lose 10 per cent of your body weight. This will have big health benefits – even if you are still overweight afterwards – and can feel more achievable. Don’t be disheartened if it’s going to take a long time to get to your ideal weight. It probably took a long time to come on gradually.",
        imageInt = R.drawable.image2
    ),
    ItemMockData(
        name = "3. Make changes that work for your lifestyle",
        content = "There's no shortage of diets, tools and foods that claim they will help us lose weight. Despite these bewildering choices, the main principle of losing weight is simple: the energy you take in (calories) needs to be less than the energy you use.\nBeyond that, which diet works will vary from person to person – one of the biggest factors is finding something you can stick to. The important thing is to find the path that is right for you.\nMany people find it helpful not to think about a ‘diet’, but rather an approach you can sustain over the long term, that fits with your lifestyle. Some people find reducing fat or carbohydrates works, some count calories, while others lower their calorie intake on certain days. It’s important your plan is not so restrictive that it cuts out whole food groups, otherwise you could miss out on essential nutrients.",
        imageInt = R.drawable.image3
    ),
    ItemMockData(
        name = "4. Eat a balanced diet",
        content = "Reduced-calorie, low-calorie or light versions of your favourite foods may be helpful, but don’t assume this means that they are also low in salt and sugar. So check food labels and try to make healthy choices, not just lower-calorie ones.\nYou don’t need to cut out all foods that are higher in calories – some of them come with healthy nutrients, for example oily fish, unsalted nuts and avocado. But you might want to eat them less often, or limit your portion size.",
        imageInt = R.drawable.image4
    ),
    ItemMockData(
        name = "5. Don't give up if your progress is slow",
        content = "An ‘ideal’ weight can take a while to achieve and may seem unattainable at times. Don’t feel disheartened if your weight loss is slow or you hit a plateau. Maintaining even a small weight loss is beneficial for your health in the long term and something to be proud of. So keep it up!",
        imageInt = R.drawable.image5
    ),
)