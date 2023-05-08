public class ListaDupla {

    Celula primeira;
    Celula ultima;
    int totalDeElementos = 0;

    public boolean posicaoOcupada(int pos) {
        return ((pos >= 0) && (pos < this.totalDeElementos));
    }

    public Celula pegaCelula(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posi��o n�o existe");
        } else {
            Celula atual = this.primeira;
            for (int i = 0; i < pos; i++) {
                atual = atual.getProxima();
            }
            return atual;
        }
    }

    public Object pega(int pos) {
        return (this.pegaCelula(pos).getElemento());
    }

    public void adicionarNoComeco(Object elemento) {
        if (this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalDeElementos++;
    }

    public void adicionar(Object elemento) {
        if (this.totalDeElementos == 0) {
            this.adicionarNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    public void adicionar(int pos, Object elemento) {
        if (pos == 0) {
            this.adicionarNoComeco(elemento);
        } else if (pos == this.totalDeElementos) {
            this.adicionar(elemento);
        } else {
            Celula anterior = this.pegaCelula(pos - 1);
            Celula proxima = anterior.getProxima();
            Celula nova = new Celula(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.totalDeElementos++;
    }
}


    public void removedoComeco() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posi��o n�o existe");
        } else {
            this.primeira = this.primeira.getProxima();
            this.totalDeElementos--;
        }
        if (this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }

    public void removedoFim() {
        if (!this.posicaoOcupada(totalDeElementos - 1)) {
            throw new IllegalArgumentException("Posicao nao existe");
        } else {
            if (this.totalDeElementos == 1) {
                this.removedoComeco();
            } else {
                Celula penultima = this.ultima.getAnterior();
                penultima.setProxima(null);
                this.ultima = penultima;
                this.totalDeElementos--;
            }
        }
    }

    public void remove(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posi��o n�o existe");
        } else {
            if (pos == 0) {
                this.removedoComeco();
            } else if (pos == this.totalDeElementos - 1) {
                this.removedoFim();
            } else {
                Celula anterior = this.pegaCelula(pos - 1);
                Celula atual = anterior.getProxima();
                Celula proxima = atual.getProxima();
                anterior.setProxima(proxima);
                proxima.setAnterior(anterior);
                this.totalDeElementos--;
            }
        }
    }

    public boolean contem(Object elemento) {
        Celula atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return (true);
            }
            atual = atual.getProxima();
        }
        return (false);
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public void esvaziaLista() {
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;
    }

    public String imprimir() {
        if (this.totalDeElementos == 0) {
            return ("[]");
        } else {
            StringBuilder builder = new StringBuilder("[");
            Celula atual = this.primeira;
            for (int i = 0; i < this.totalDeElementos - 1; i++) {
                builder.append(atual.getElemento());
                builder.append(", ");
                atual = atual.getProxima();
            }
            if (atual != null) {
                builder.append(atual.getElemento());
            }

            builder.append("]");
            return (builder.toString());
        }
    }
}