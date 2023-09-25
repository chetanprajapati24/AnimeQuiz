package com.jay.animequiz.model.repository;

import com.jay.animequiz.model.QuestionModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class QuestionDataSourceImpl implements QuestionDataSource{
    @Override
    public  List<QuestionModel>generateRandomList(HashSet<Integer> randomSet){
        List<QuestionModel> randomQuestionList = new ArrayList<>();
        List<QuestionModel> questions = questionsProvider();
        for(int index : randomSet){
            randomQuestionList.add(questions.get(index));
        }
         return randomQuestionList;
    }
    private static List<QuestionModel> questionsProvider(){
        return new ArrayList<>(Arrays.asList(
                new QuestionModel(
                        "We all know that Jaeger in German is hunter, but do you know what Eren means and what language it is in?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/attack-on-titan-test-resultado-eren-768x432.jpg",
                        "Holy.",
                        "Demon",
                        "Hero",
                        1
                ),
                new QuestionModel(
                        "What number did King Karl Fritz occupy in the royal lineage?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/karl-fritz-shingeki-test-768x432.jpg",
                        "He was the 136th king.",
                        "He was the 145th king.",
                        "He was the 126th king.",
                        2
                ),
                new QuestionModel(
                        "What is the name of the magazine where the manga is published?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/test-shingeki-768x432.jpg",
                        "Weekly Shonen Jump.",
                        "Shonen Magazine",
                        "Bessatsu Shonen Magazine.",
                        3
                ),
                new QuestionModel(
                        "What is the name of Grisha Jaeger's first wife?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-test-grisha-jaeger-768x432.jpg",
                        "Carla Jaeger",
                        "Dina Fritz",
                        "Frieda Reiss",
                        2
                ),
                new QuestionModel(
                        "What is the generation that Eren graduated from as a cadet?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-test-manga-768x432.jpg",
                        "101°",
                        "104°",
                        "98°",
                        2
                ),
                new QuestionModel(
                        "In what year was the Shingeki no Kyojin anime released?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-anime-estreno-test-768x432.png",
                        "2011",
                        "2012",
                        "2013",
                        3
                ),
                new QuestionModel(
                        "After Erwin's death, who is the commander of the Survey Corps?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-test-erwin-768x432.jpg",
                        "Levi Ackerman ",
                        "Hange Zoë",
                        "Dot Pixis",
                        2
                ),
                new QuestionModel(
                        "Among Marley's warriors, who was training to be the next beast titan?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-test-marley-warriors-1-768x432.jpg",
                        "Zofia",
                        "Falco Grice",
                        "Colt Grice",
                        3
                ),
                new QuestionModel(
                        "Who was Hajime Isayama's inspiration for Titans?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/titanes-e1614889610916-768x432.jpg",
                        "Drunk",
                        "Vagabonds",
                        "Characters from your nightmares",
                        1
                ),
                new QuestionModel(
                        "What is the lowest a titan can measure?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-titanes-test-hange-768x432.jpg",
                        "3",
                        "5",
                        "6",
                        1
                ),
                new QuestionModel(
                        "What is the Japanese name for 'Attack on Titan'?",
                        "https://s1.1zoom.me/big0/38/Attack_on_Titan_eren_442810.jpg",
                        "Kimi and Todoke",
                        "Kosaku Shima",
                        "Shingeki no Kyojin",
                        3
                ),
                new QuestionModel(
                        "While in his pure Titan form, who eats Bertholdt Hoover?",
                        "https://pm1.narvii.com/7859/dec0e1c0a29766263a4a4316edb92a9ee4f20b0dr1-736-414v2_hq.jpg",
                        "Reiner Braun",
                        "armin arlert",
                        "Eren Yeager",
                        2
                ),
                new QuestionModel(
                        "Who does Levi team up with to rescue Eren from the Female Titan?",
                        "https://w.wallhaven.cc/full/5d/wallhaven-5dg771.jpg",
                        "Mikasa Ackerman",
                        "Jean Kirschtien",
                        " Kitz Weilman",
                        1
                ),
                new QuestionModel(
                        "What is the method that turns Ymir's children into titans?",
                        "https://w.wallhaven.cc/full/0p/wallhaven-0pgrqp.jpg",
                        "Eat by an existing Titan",
                        "Torture",
                        "An injection",
                        3
                ),
                new QuestionModel(
                        "The 3 walls were named after the daughters of which king?",
                        "https://w.wallhaven.cc/full/y8/wallhaven-y8qj9g.png",
                        "The king of beautiful",
                        "King Fritz",
                        "Demon king",
                        2
                ),
                new QuestionModel(
                        "What relationship does Kenny the Ripper have with Levi Ackerman?",
                        "https://w.wallhaven.cc/full/pk/wallhaven-pk9qop.png",
                        "Your uncle",
                        "His father",
                        "His brother",
                        1
                ),
                new QuestionModel(
                        "The Founding Titan allows its user to take control of other Titans by doing what?",
                        "https://tierragamer.com/wp-content/uploads/2022/02/titan-fundador-shingeki-no-kyojin-768x432.jpg",
                        "Whistle",
                        "Screaming",
                        "Telepathy",
                        2
                ),
                new QuestionModel(
                        "Who did Jean Kirschtein disguise himself as when he was taken to the Imperial Capital to stand trial?",
                        "https://www.geekmi.news/__export/1629127349152/sites/debate/img/2021/08/16/jean1.jpg_976912859.jpg",
                        " Levi Ackermann",
                        "Eren Yeager",
                        "Connie Springer",
                        2
                ),
                new QuestionModel(
                        "What did Levi find in the fake background of Eren's basement desk?",
                        "https://static.wikia.nocookie.net/shingekinokyojin/images/9/90/Anime_basement.png",
                        "Books",
                        "An amulet",
                        "A key",
                        1
                ),
                new QuestionModel(
                        "How did Eren accidentally activate his Titan transformation?",
                        "https://w.wallhaven.cc/full/ym/wallhaven-ym63ol.jpg",
                        "Trying to catch a spoon",
                        "Sneezing",
                        "Riding a horse",
                        1
                ),
                new QuestionModel(
                        "How long does someone live after eating a person who controls one of the 9 Titans?",
                        "https://w.wallhaven.cc/full/49/wallhaven-49dj6x.jpg",
                        "10 years",
                        "13 years",
                        "19 years",
                        2
                ),
                new QuestionModel(
                        "What was the last gift Kenny Ackermann gave Levi?",
                        "https://i.ytimg.com/vi/GIJmmMs8OrQ/maxresdefault.jpg",
                        "One of his weapons",
                        "A necklace from Levi's mother",
                        "Titan injection",
                        3
                ),
                new QuestionModel(
                        "What color were the signal flares that the Scout Regiment used to warn of approaching titans?",
                        "https://pm1.narvii.com/6282/ac1dfac4496aa8f22d32595064f31bdba021bd80_hq.jpg",
                        "Yellow and orange",
                        "White green",
                        "Black red",
                        3
                ),
                new QuestionModel(
                        "Kiyomi Azumabito is the ambassador of which nation?",
                        "https://static1.dualshockersimages.com/wordpress/wp-content/uploads/2022/03/Who-is-Azumabito-in-Attack-on-Titan.jpg",
                        "Hizaru",
                        "Andor",
                        "Star city",
                        1
                ),
                new QuestionModel(
                        "In what year did the Battle of Shiganshina District take place?",
                        "https://w.wallhaven.cc/full/95/wallhaven-9578jw.jpg",
                        "875",
                        "850",
                        "920",
                        2
                ),
                new QuestionModel(
                        "What does Eren use to seal Wall Rose after it breaks?",
                        "https://w.wallhaven.cc/full/ne/wallhaven-neyp68.jpg",
                        "A dead titan",
                        "Titan Crystal",
                        "A rock",
                        3
                ),
                new QuestionModel(
                        "In Eldian mythology, who gave Ymir Fritz the power of the Titans?",
                        "https://static1.cbrimages.com/wordpress/wp-content/uploads/2020/02/Attack-on-Titan-Ymir-Fritz-Founder-header.png",
                        "The spawn of the devil",
                        "The devil of all the earth",
                        "The Devil of Helos",
                        2
                )


        ));
    }

}
