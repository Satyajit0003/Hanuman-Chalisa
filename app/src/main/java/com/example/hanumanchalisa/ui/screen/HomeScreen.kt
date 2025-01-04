package com.example.hanumanchalisa.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hanumanchalisa.ui.theme.HanumanChalisaTheme


 val hanumanChalisa = listOf<String>(

"जय हनुमान ज्ञान गुन सागर। जय कपीस तिहुं लोक उजागर।।\n"+
"राम दूत अतुलित बल धामा। अंजनि-पुत्र पवनसुत नामा।।",

"महाबीर बिक्रम बजरंगी। कुमति निवार सुमति के संगी।।\n"+
"कंचन बरन बिराज सुबेसा। कानन कुण्डल कुँचित केसा।।",

"हाथ बज्र औ ध्वजा बिराजे। कांधे मूंज जनेउ साजे।।\n"+
"शंकर सुवन केसरी नंदन। तेज प्रताप महा जग वंदन।।",

"बिद्यावान गुनी अति चातुर। राम काज करिबे को आतुर।।\n"+
"प्रभु चरित्र सुनिबे को रसिया। राम लखन सीता मन बसिया।।",

"सूक्ष्म रूप धरि सियहिं दिखावा। बिकट रूप धरि लंक जरावा।।\n"+
"भीम रूप धरि असुर संहारे। रामचन्द्र के काज संवारे।।",

"लाय सजीवन लखन जियाये। श्री रघुबीर हरषि उर लाये।।\n"+
"रघुपति कीन्ही बहुत बड़ाई। तुम मम प्रिय भरतहि सम भाई।।",

"सहस बदन तुम्हरो जस गावैं। अस कहि श्रीपति कण्ठ लगावैं।।\n"+
"सनकादिक ब्रह्मादि मुनीसा। नारद सारद सहित अहीसा।।",

"जम कुबेर दिगपाल जहां ते। कबि कोबिद कहि सके कहां ते।।\n"+
"तुम उपकार सुग्रीवहिं कीन्हा। राम मिलाय राज पद दीन्हा।।",

"तुम्हरो मंत्र बिभीषन माना। लंकेश्वर भए सब जग जाना।।\n"+
"जुग सहस्र जोजन पर भानु। लील्यो ताहि मधुर फल जानू।।",

"प्रभु मुद्रिका मेलि मुख माहीं। जलधि लांघि गये अचरज नाहीं।।\n"+
"दुर्गम काज जगत के जेते। सुगम अनुग्रह तुम्हरे तेते।।",

"राम दुआरे तुम रखवारे। होत न आज्ञा बिनु पैसारे।।\n"+
"सब सुख लहै तुम्हारी सरना। तुम रच्छक काहू को डर ना।।",

"आपन तेज सम्हारो आपै। तीनों लोक हांक तें कांपै।।\n"+
"भूत पिसाच निकट नहिं आवै। महाबीर जब नाम सुनावै।।",

"नासै रोग हरे सब पीरा। जपत निरन्तर हनुमत बीरा।।\n"+
"संकट तें हनुमान छुड़ावै। मन क्रम बचन ध्यान जो लावै।।",

"सब पर राम तपस्वी राजा। तिन के काज सकल तुम साजा।।\n"+
"और मनोरथ जो कोई लावै। सोई अमित जीवन फल पावै।।",

"चारों जुग परताप तुम्हारा। है परसिद्ध जगत उजियारा।।\n"+
"साधु संत के तुम रखवारे।। असुर निकन्दन राम दुलारे।।",

"अष्टसिद्धि नौ निधि के दाता। अस बर दीन जानकी माता।।\n"+
"राम रसायन तुम्हरे पासा। सदा रहो रघुपति के दासा।।",

"तुह्मरे भजन राम को पावै। जनम जनम के दुख बिसरावै।।\n"+
"अंत काल रघुबर पुर जाई। जहां जन्म हरिभक्त कहाई।।",

"और देवता चित्त न धरई। हनुमत सेइ सर्ब सुख करई।।\n"+
"सङ्कट कटै मिटै सब पीरा। जो सुमिरै हनुमत बलबीरा।।",

"जय जय जय हनुमान गोसाईं। कृपा करहु गुरुदेव की नाईं।।\n"+
"जो सत बार पाठ कर कोई। छूटहि बन्दि महा सुख होई।।",

"जो यह पढ़ै हनुमान चालीसा। होय सिद्धि साखी गौरीसा।।\n"+
"तुलसीदास सदा हरि चेरा। कीजै नाथ हृदय महं डेरा।।",

)

@Composable
fun HomeScreen(innerPadding: PaddingValues = PaddingValues(0.dp)) {
    var count by remember { mutableIntStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize().padding(innerPadding)
    ) {
        Spacer(modifier = Modifier.weight(1f))
        ChaupaiText(count)
        Spacer(modifier = Modifier.weight(1f))
        RawButton(
            {if(count > 0) {
                count--
            }},
            {if(count < hanumanChalisa.size - 1) {
                count++
            }}
        )
    }
}

@Composable
fun ChaupaiText(count: Int) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = hanumanChalisa[count],
        textAlign = TextAlign.Center,
        color = Color(0xFFFFA500),
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 29.sp
        )
    )
}

@Composable
fun RawButton(
    onPrev: () -> Unit,
    onNext: () -> Unit
){
    Row(
        modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        Button(onClick = { onPrev() }) {
            Text(text = "Prev")
        }
        Button(onClick = { onNext() }) {
            Text(text = "Next")
        }
    }
}

@Preview
@Composable
fun DefaultHomeScreenPreview() {
    HanumanChalisaTheme {
        HomeScreen()
    }
}