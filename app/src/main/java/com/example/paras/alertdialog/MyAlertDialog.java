package com.example.paras.alertdialog;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class MyAlertDialog extends DialogFragment
{
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());

        dialogBuilder.setTitle("this is title");
       dialogBuilder.setMultiChoiceItems(R.array.days, null, new DialogInterface.OnMultiChoiceClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int itemIndex, boolean isChecked)
           {
               Toast.makeText(getActivity(),"item no :"+itemIndex+"  = " +isChecked, Toast.LENGTH_SHORT).show();
           }
       });


        dialogBuilder.setNegativeButton("cancle", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int which)
            {
                Toast.makeText(getActivity(), "cancle clicked", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

        dialogBuilder.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                Toast.makeText(getActivity(), "ok clicked", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

        Dialog dialog = dialogBuilder.create();

              return dialog;
    }
}
