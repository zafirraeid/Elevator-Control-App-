package com.example.helloworld;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class elevator_3 extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,
            button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,
            buttonB1,buttonB2;

    private ImageButton openBtn,closeBtn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elevator_3);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        buttonB1 = (Button) findViewById(R.id.buttonB1);
        buttonB2 = (Button) findViewById(R.id.buttonB2);
        openBtn = (ImageButton) findViewById(R.id.openBtn);
        closeBtn = (ImageButton) findViewById(R.id.closeBtn);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 1");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button1.setBackgroundColor(Color.CYAN);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 2");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button2.setBackgroundColor(Color.CYAN);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 3");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button3.setBackgroundColor(Color.CYAN);
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 4");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button4.setBackgroundColor(Color.CYAN);
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 5");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button5.setBackgroundColor(Color.CYAN);
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 6");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button6.setBackgroundColor(Color.CYAN);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 7");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button7.setBackgroundColor(Color.CYAN);
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 8");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button8.setBackgroundColor(Color.CYAN);
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 9");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button9.setBackgroundColor(Color.CYAN);
            }
        });



        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 10");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button10.setBackgroundColor(Color.CYAN);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 11");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button11.setBackgroundColor(Color.CYAN);

            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 12");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button12.setBackgroundColor(Color.CYAN);

            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 13");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button13.setBackgroundColor(Color.CYAN);
            }
        });


        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 14");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button14.setBackgroundColor(Color.CYAN);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 15");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button15.setBackgroundColor(Color.CYAN);
            }
        });


        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 16");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button16.setBackgroundColor(Color.CYAN);
            }
        });


        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 17");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button17.setBackgroundColor(Color.CYAN);
            }
        });


        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 18");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button18.setBackgroundColor(Color.CYAN);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 19");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button19.setBackgroundColor(Color.CYAN);
            }
        });


        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 20");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button20.setBackgroundColor(Color.CYAN);
            }
        });


        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 21");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button21.setBackgroundColor(Color.CYAN);
            }
        });



        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 22");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button22.setBackgroundColor(Color.CYAN);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 23");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button23.setBackgroundColor(Color.CYAN);

            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 24");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button24.setBackgroundColor(Color.CYAN);

            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Floor 25");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                button25.setBackgroundColor(Color.CYAN);

            }
        });

        buttonB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Basement 1");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                buttonB1.setBackgroundColor(Color.CYAN);

            }
        });
        buttonB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Going to Basement 2");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                buttonB2.setBackgroundColor(Color.CYAN);

            }
        });
       openBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Opening Doors");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();

            }
        });

        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(elevator_3.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Closing Doors");
                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();

            }
        });








    }
}