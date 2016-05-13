package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;


public class Adaptador extends BaseAdapter{
    ArrayList<String> arreglo;
    Context context;
    LayoutInflater inflater=null;

    public Adaptador(Context context, ArrayList<String> arreglo) {
        this.arreglo = arreglo;
        this.context = context;
        inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem(int position) {
        return arreglo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if(vi == null) vi = inflater.inflate(R.layout.item, null);

        //ARMAR TODOS LOS
        TextView texto_item = (TextView) vi.findViewById(R.id.texto_item);

        //CARGAR INFROMACION
        texto_item.setText(arreglo.get(position));

        return vi;
    }
}