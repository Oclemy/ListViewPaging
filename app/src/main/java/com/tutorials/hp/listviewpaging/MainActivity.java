package com.tutorials.hp.listviewpaging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

/*
- Our MainActivity class.
- Our widgets will be a listview and two buttons: next and previous.
- We instantiate our Paginator here and page data.
- We toggle button states depending on current page.
 */
public class MainActivity extends AppCompatActivity {


    ListView listView;
    Button nextBtn, prevBtn;
    Paginator p = new Paginator();
    private int totalPages =p.getTotalPages();
    private int currentPage = 0;
    CustomAdapter adapter;


    /*
    - When activity is created
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initializeViews();
        this.bindData(currentPage);
        prevBtn.setEnabled(false);

        //NAVIGATE
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPage += 1;
                bindData(currentPage);
                toggleButtons();
            }
        });
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPage -= 1;
                bindData(currentPage);
                toggleButtons();
            }
        });
    }

    /*
    - Initialize ListView.
     */
    private void initializeViews()
    {
        listView= (ListView) findViewById(R.id.listview);
        nextBtn = (Button) findViewById(R.id.nextBtn);
        prevBtn = (Button) findViewById(R.id.prevBtn);
    }

    /*
    - Bind data to ListView.
     */
    private void bindData(int page) {
        adapter=new CustomAdapter(this,p.getCurrentGalaxys(page));
        listView.setAdapter(adapter);
    }


    /*
    - Toggle button states
     */
    private void toggleButtons() {
        //SINGLE PAGE DATA
        if (totalPages <= 1) {
            nextBtn.setEnabled(false);
            prevBtn.setEnabled(false);
        }
        //LAST PAGE
        else if (currentPage == totalPages) {
            nextBtn.setEnabled(false);
            prevBtn.setEnabled(true);
        }
        //FIRST PAGE
        else if (currentPage == 0) {
            prevBtn.setEnabled(false);
            nextBtn.setEnabled(true);
        }
        //SOMEWHERE IN BETWEEN
        else if (currentPage >= 1 && currentPage <= totalPages) {
            nextBtn.setEnabled(true);
            prevBtn.setEnabled(true);
        }

    }
}
