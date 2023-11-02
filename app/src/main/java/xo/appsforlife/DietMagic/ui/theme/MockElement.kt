package xo.appsforlife.DietMagic.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import xo.appsforlife.DietMagic.R
import xo.appsforlife.DietMagic.data.ItemMockData
import xo.appsforlife.DietMagic.data.mockData

@Composable
fun MockElement (
    modifier: Modifier = Modifier,
    itemMockData: ItemMockData
){
    Column (
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            modifier = modifier.fillMaxWidth(),
            text = itemMockData.name,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            color = selected
        )
        Spacer(modifier = modifier.height(5.dp))
        Image(
            modifier = modifier
                .fillMaxWidth(),
            painter = painterResource(id = itemMockData.imageInt),
            contentDescription = "",
            contentScale = ContentScale.FillWidth)
        Spacer(modifier = modifier.height(5.dp))
        Text(
            modifier = modifier.fillMaxWidth(),
            text = itemMockData.content,
            fontSize = 14.sp
        )
    }
}

@Preview
@Composable
fun SampleMockElement() {
    MockElement(
        itemMockData = mockData.first()
    )
}
