package com.example.uasmobile.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.uasmobile.R;
import com.example.uasmobile.util.HasilKuis;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuizFragment extends Fragment {

    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;

    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            "Berapakah Nabi yang termasuk dalam Ulul Azmi?",
            "Istri Nabi Ibrahim yang Pertama adalah...",
            "Siapa Nama Ibu Nabi Isa?",
            "Pada masa siapakah Nabi Musa Lahir",
            "Siapakah nabi yang dikorbankan oleh Nabi Ibrahim karena perintah Allah?",
            "Siapakah nama anak Nabi Nuh yang menentang ajaran Nabi Nuh?",
            "Pada tanggal berapakah nabi Muhammad lahir??",
            "Siapakah nama paman nabi Muhammad SAW yang merawatnya?",
            "Pada umur berapakah Nabi Muhammad diangkat menjadi Rasul?",
            "Siapa nama Ratu Mesir yang mengangkat Nabi Musa AS menjadi putranya?"
    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            "5", "25", "1", "15",
            "Siti Sarah", "Siti Hajar", "Aminah", "Siti Hadijah",
            "Siti Maryam", "Siti Hadijah", "Siti Hajar", "Siti Sarah",
            "Raja Firaun", "Raja Namrud", "Raja Sulaiman", "Ubaidillah",
            "Nabi Musa AS", "Nabi Isa AS", "Nabi Malik AS", "Nabi Ismail AS",
            "Yafith", "Sam", "Ham", "Kan'an",
            "12 Rabiul Akhir", "12 Jumadil Awal", "12 Jumadil Akhir", "12 Rabiul Awal",
            "Abdul Muthalib", "Abu Jahal", "Abu Thalib", "Abdullah",
            "25", "8", "45", "40",
            "Siti Hajar", "Zaenab", "Asiyah", "Aisyah"
    };

    //jawaban benar
    String[] jawaban_benar = new String[]{
            "5",
            "Siti Sarah",
            "Siti Maryam",
            "Raja Firaun",
            "Nabi Ismail AS",
            "Kan'an",
            "12 Rabiul Awal",
            "Abu Thalib",
            "40",
            "Asiyah"
    };

    public QuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        pertanyaan = (TextView) view.findViewById(R.id.pertanyaan);
        rg = (RadioGroup) view.findViewById(R.id.radio_group);
        PilihanA = (RadioButton) view.findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) view.findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) view.findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) view.findViewById(R.id.pilihanD);

        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;

        Button next = view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(PilihanA.isChecked()||PilihanB.isChecked()||PilihanC.isChecked()||PilihanD.isChecked()) {
                    RadioButton jawaban_user = (RadioButton) getActivity().findViewById(rg.getCheckedRadioButtonId());
                    String ambil_jawaban_user = jawaban_user.getText().toString();
                    rg.check(0);
                    if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
                    else salah++;
                    nomor++;
                    if (nomor < pertanyaan_kuis.length) {
                        pertanyaan.setText(pertanyaan_kuis[nomor]);
                        PilihanA.setText(pilihan_jawaban[(nomor * 4) + 0]);
                        PilihanB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                        PilihanC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                        PilihanD.setText(pilihan_jawaban[(nomor * 4) + 3]);
                    } else {
                        hasil = benar * 10;
                        Intent selesai = new Intent(QuizFragment.this.getActivity(), HasilKuis.class);
                        startActivity(selesai);
                    }
                }
                else{
                    Toast.makeText(getContext(), "Pilih Jawaban Dulu", Toast.LENGTH_SHORT).show();
                }
            }

        });
        return view;
    }
}
