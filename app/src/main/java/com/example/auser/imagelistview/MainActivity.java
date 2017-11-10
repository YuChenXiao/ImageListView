package com.example.auser.imagelistview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
ListView listView;
    String[] text1 ={"item1","item2","item3","item4","item5"};
    String[] text2 ={"1hr ago","2hr ago","3hr ago","4hr ago","5hr ago"};
    int[]imgResId ={R.drawable.backup,R.drawable.browser,R.drawable.calculator,R.drawable.calendar,R.drawable.contacts};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView) findViewById(R.id.listview);
        Map<String,Object> map;
        List<Map<String,Object>> list =new ArrayList<>();
        for (int i=0;i<text1.length;i++){
            map=new HashMap<>();
            map.put("imgResId",imgResId[i]);
            map.put("text1",text1[i]);
            map.put("text2",text2[i]);
            list.add(map);
        }
        SimpleAdapter adapter =new SimpleAdapter(this,list,R.layout.item_layout,new String[]{"imgResId,text1,text2"},new
        int[]{R.id.imageView,R.id.textView2,R.id.textView3});
        listView.setAdapter(adapter);
    }
}
